package com.awildwillpill.rocketboots2.procedures;

import net.minecraft.entity.Entity;

import java.util.Map;

import com.awildwillpill.rocketboots2.RocketBoots2Mod;

public class RocketBootsTickEventProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RocketBoots2Mod.LOGGER.warn("Failed to load dependency entity for procedure RocketBootsTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.isSneaking())) {
			entity.setMotion(0, 0.05, 0);
		}
	}
}
