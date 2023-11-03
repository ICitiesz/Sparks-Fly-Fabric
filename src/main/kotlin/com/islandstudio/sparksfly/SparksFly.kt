package com.islandstudio.sparksfly

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object SparksFly : ModInitializer {
    const val MOD_ID = "sparks-fly"

	private val logger = LoggerFactory.getLogger("sparks-fly")

	override fun onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		logger.info("Hello Fabric world!")
	}
}