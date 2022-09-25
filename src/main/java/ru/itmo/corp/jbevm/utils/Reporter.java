package ru.itmo.corp.jbevm.utils;

import ru.itmo.corp.jbevm.token.Token;
import ru.itmo.corp.jbevm.token.TokenType;


public class Reporter {
    public static void error(int line, String message) {
        report(line, "", message);
    }

    public static void error(String message) {
        report(message);
    }

    public static void error(Token token, String message) {
        if (token.type == TokenType.EOF) {
            report(token.line, " at end", message);
        } else {
            report(token.line, " at '" + token.lexeme + "'", message);
        }
    }

    private static void report(int line, String where, String message) {
        System.err.println(
                "[line " + line + "] Error" + where + ": " + message);
    }

    private static void report(String message) {
        System.err.println(message);
    }
}
