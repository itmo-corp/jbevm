package ru.itmo.corp.jbevm.lexer;

import org.junit.jupiter.api.Test;
import ru.itmo.corp.jbevm.token.Token;

import java.io.*;
import java.util.List;

import static ru.itmo.corp.jbevm.token.TokenType.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LexerTest {
    @Test
    public void testLexer() {
        List<Token> tokens = (new Lexer("double a = b + (1 * MyClass.foo - 1.44)")).scanTokens();
        assertEquals(tokens.size(), 15);
        assertEquals(tokens.get(0).type, DOUBLE_TYPE);
        assertEquals(tokens.get(1).type, IDENTIFIER);
        assertEquals(tokens.get(1).lexeme, "a");
        assertEquals(tokens.get(2).type, EQUAL);
        assertEquals(tokens.get(3).type, IDENTIFIER);
        assertEquals(tokens.get(4).type, PLUS);
        assertEquals(tokens.get(5).type, LEFT_PAREN);
        assertEquals(tokens.get(8).type, IDENTIFIER);
        assertEquals(tokens.get(8).lexeme, "MyClass");
        assertEquals(tokens.get(9).type, DOT);
        assertEquals(tokens.get(10).lexeme, "foo");
    }

    @Test
    public void testNumbers() {
        List<Token> tokens = (new Lexer("5 7  \t 10 \n\n\n 66.666   100_000.91")).scanTokens();
        assertEquals(tokens.get(0).type, INT_NUMBER);
        assertEquals(tokens.get(0).literal, 5);
        assertEquals(tokens.get(1).literal, 7);
        assertEquals(tokens.get(3).literal, 66.666);
        assertEquals(tokens.get(4).type, FLOAT_NUMBER);
        assertEquals(tokens.get(4).literal, 100_000.91);
    }

    @Test
    public void testStrings() {
        List<Token> tokens = (new Lexer("\"My best string\"   \"   \n\"")).scanTokens();
        assertEquals(tokens.get(0).type, STRING);
        assertEquals(tokens.get(0).literal, "My best string");
        assertEquals(tokens.get(1).literal, "   \n");
    }

    @Test
    public void testChars() {
        List<Token> tokens = (new Lexer("'a' '6'")).scanTokens();
        assertEquals(tokens.get(0).type, CHAR);
        assertEquals(tokens.get(0).literal, 'a');
        assertEquals(tokens.get(1).literal, '6');
    }

    @Test
    public void testUnexpectedCharacters() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setErr(new PrintStream(outContent));

        (new Lexer("π")).scanTokens();
        assertEquals("[line 1] Error: Unexpected character.\n", outContent.toString());
    }

    @Test
    public void testUnterminatedStringVariable() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setErr(new PrintStream(outContent));

        (new Lexer("\"im'a string")).scanTokens();
        assertEquals("[line 1] Error: Unterminated string variable.\n", outContent.toString());
    }

    @Test
    public void testUnterminatedCharVariable() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setErr(new PrintStream(outContent));

        (new Lexer("\"this is string\"\n'a")).scanTokens();
        assertEquals("[line 2] Error: Unterminated char variable.\n", outContent.toString());
    }
}
