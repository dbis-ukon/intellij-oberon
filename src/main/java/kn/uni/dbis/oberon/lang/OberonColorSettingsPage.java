package kn.uni.dbis.oberon.lang;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class OberonColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Keywords", OberonSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Built-in type", OberonSyntaxHighlighter.TYPE),
            new AttributesDescriptor("Identifier", OberonSyntaxHighlighter.IDENTIFIER),
            new AttributesDescriptor("Operator", OberonSyntaxHighlighter.OPERATOR),
            new AttributesDescriptor("Predefined symbol", OberonSyntaxHighlighter.SYMBOL),
            new AttributesDescriptor("Comment", OberonSyntaxHighlighter.COMMENT),
            new AttributesDescriptor("Constant", OberonSyntaxHighlighter.CONSTANT),
            new AttributesDescriptor("Boolean", OberonSyntaxHighlighter.BOOLEAN),
            new AttributesDescriptor("Integer", OberonSyntaxHighlighter.INTEGER),
            new AttributesDescriptor("Real", OberonSyntaxHighlighter.REAL),
            new AttributesDescriptor("String", OberonSyntaxHighlighter.STRING),
            new AttributesDescriptor("Nil", OberonSyntaxHighlighter.NIL),
            new AttributesDescriptor("Bad value", OberonSyntaxHighlighter.BAD_CHARACTER)
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return OberonIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new OberonSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "MODULE HelloWorld;\n\n" +
               "CONST Message = \"Hoi Niklaus!\\n\";\n\n" +
               "(* Import `printf` function from C <stdio.h> library. *)\n" +
               "PROCEDURE printf(format: STRING; ...): INTEGER; EXTERN;\n\n" +
               "(* Writes a string value to standard out. *)\n" +
               "PROCEDURE Write(str: STRING);\n" +
               "BEGIN\n" +
               "    printf(str)\n" +
               "END Write;\n\n" +
               "BEGIN\n" +
               "    Write(Message)\n" +
               "END HelloWorld.";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Oberon";
    }

}
