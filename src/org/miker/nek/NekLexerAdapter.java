package org.miker.nek;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class NekLexerAdapter extends FlexAdapter {
    public NekLexerAdapter() {
        super(new NekLexer((Reader) null));
    }
}