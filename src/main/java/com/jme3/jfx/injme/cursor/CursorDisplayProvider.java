package com.jme3.jfx.injme.cursor;

import com.sun.javafx.cursor.CursorFrame;
import com.sun.javafx.cursor.CursorType;
import org.jetbrains.annotations.NotNull;

/**
 * The provider to implement the process of showing different types of cursors.
 *
 * @author JavaSaBr
 */
public interface CursorDisplayProvider {

    /**
     * This method will be called on initializing javaFX container to prepare an image for the cursor type.
     *
     * @param cursorType the cursor type.
     */
    void prepare(@NotNull CursorType cursorType);

    /**
     * Shows an image for the cursor frame.
     *
     * @param cursorFrame the cursor frame.
     */
    void show(@NotNull CursorFrame cursorFrame);
}
