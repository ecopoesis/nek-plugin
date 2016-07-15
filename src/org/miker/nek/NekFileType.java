package org.miker.nek;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;

import javax.swing.*;

public class NekFileType extends LanguageFileType {
    public static final NekFileType INSTANCE = new NekFileType();

    private NekFileType() {
        super(NekLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "NEK file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "NEK language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "nek";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return NekIcons.FILE;
    }
}