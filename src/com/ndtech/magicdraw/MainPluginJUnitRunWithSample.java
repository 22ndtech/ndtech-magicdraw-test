package com.ndtech.magicdraw;

import com.nomagic.magicdraw.tests.MagicDrawTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

@RunWith(MagicDrawTestRunner.class)
public class MainPluginJUnitRunWithSample
{
    @Test
    public void testPluginInitialized()
    {
        assertTrue(MainPlugin.m_initialized);
    }
}
