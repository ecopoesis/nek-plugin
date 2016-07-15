package org.miker.nek;

import com.intellij.lang.Language;

public class NekLanguage extends Language {
    public static final NekLanguage INSTANCE = new NekLanguage();

    private NekLanguage() {
        super("NEK Language");
    }
}