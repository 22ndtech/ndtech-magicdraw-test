package com.ndtech.magicdraw;

import com.nomagic.magicdraw.tests.MagicDrawTestCase;

public class MainPluginMagicDrawTestCaseSample extends MagicDrawTestCase{

	public void testPluginInitialized() {
		assertTrue(MainPlugin.m_initialized);
	}
}
