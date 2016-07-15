package org.miker.nek;

import com.intellij.openapi.fileTypes.*;
import org.jetbrains.annotations.NotNull;

public class NekFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(NekFileType.INSTANCE, "nek");
    }
}