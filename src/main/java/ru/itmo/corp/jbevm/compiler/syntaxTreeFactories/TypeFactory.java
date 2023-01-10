package ru.itmo.corp.jbevm.compiler.syntaxTreeFactories;

import ru.itmo.corp.jbevm.compiler.types.IntJType;
import ru.itmo.corp.jbevm.compiler.types.JType;
import ru.itmo.corp.jbevm.compiler.types.UnresolvedJType;
import ru.itmo.corp.jbevm.compiler.types.VoidJType;

public class TypeFactory {
  public static JType createTypeOrVoid(ru.itmo.corp.jbevm.antlr.JbevmParser.TypeTypeOrVoidContext ctx) {
    if (ctx.typeType() != null) {
      return createType(ctx.typeType());
    } else if (ctx.VOID() != null) {
      return new VoidJType();
    } else {
      throw new IllegalStateException("Unknown type");
    }
  }

  public static JType createType(ru.itmo.corp.jbevm.antlr.JbevmParser.TypeTypeContext ctx) {
    if (ctx.primitiveType() != null) {
      return createPrimitiveType(ctx.primitiveType());
    } else if (ctx.classOrInterfaceType() != null) {
      return new UnresolvedJType(ctx.classOrInterfaceType().getText());
    } else {
      throw new IllegalStateException("Unknown type");
    }
  }

  private static JType createPrimitiveType(ru.itmo.corp.jbevm.antlr.JbevmParser.PrimitiveTypeContext ctx) {
    if (ctx.INT() != null) {
      return new IntJType();
    } else {
      throw new IllegalStateException("Unknown primitive type");
    }
  }
}
