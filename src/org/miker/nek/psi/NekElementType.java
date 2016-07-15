package org.miker.nek.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.*;
import org.miker.nek.NekLanguage;

public class NekElementType extends IElementType {
    public NekElementType(@NotNull @NonNls String debugName) {
        super(debugName, NekLanguage.INSTANCE);
    }
}