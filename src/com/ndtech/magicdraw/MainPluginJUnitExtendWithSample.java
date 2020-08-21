package com.ndtech.magicdraw;

import com.nomagic.magicdraw.tests.MagicDrawApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MagicDrawApplication.class)
public class MainPluginJUnitExtendWithSample
{
    @Test
    void testPluginInitialized()
    {
        assertTrue(MainPlugin.m_initialized);
    }
}
