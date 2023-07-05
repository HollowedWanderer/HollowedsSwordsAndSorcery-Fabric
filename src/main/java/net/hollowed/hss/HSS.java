package net.hollowed.hss;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HSS implements ModInitializer {
	public static final String MOD_ID = "hss";
    public static final Logger LOGGER = LoggerFactory.getLogger("hss");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}