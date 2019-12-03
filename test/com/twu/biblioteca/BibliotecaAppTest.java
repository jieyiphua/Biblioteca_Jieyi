package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class BibliotecaAppTest {

    private ByteArrayOutputStream byteArrayOutputStream;
    private BibliotecaApp app;

    @Before
    public void setUp() {
        app = new BibliotecaApp();
        byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
    }

    @Test
    public void shouldGetWelcomeMessage() {
        app.getWelcomeMessage();
        assertEquals("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n",  byteArrayOutputStream.toString());
    }
}