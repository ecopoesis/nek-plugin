package org.miker.nek.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.*;
import org.miker.nek.NekLanguage;

class NekTokenType extends IElementType {
    public NekTokenType(@NotNull @NonNls String debugName) {
        super(debugName, NekLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "NekTokenType." + super.toString();
    }
}