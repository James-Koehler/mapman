package me.jameskoehler.mapman;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.text.Text;

import static net.minecraft.server.command.CommandManager.*;

public class Mapman implements ModInitializer {

    @Override
    public void onInitialize() {

        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(literal("mapman")
                .executes(context -> {
                    context.getSource().sendFeedback(() -> Text.literal("Mapman is installed! Version: 1.0-SNAPSHOT."), false);

                    return 1;
                })));
    }
}
