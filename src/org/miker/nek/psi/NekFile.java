package org.miker.nek.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.miker.nek.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class NekFile extends PsiFileBase {
    public NekFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, NekLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return NekFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "NEK File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}