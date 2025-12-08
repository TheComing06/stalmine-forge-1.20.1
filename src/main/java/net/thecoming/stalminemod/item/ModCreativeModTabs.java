package net.thecoming.stalminemod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thecoming.stalminemod.StalMineMod;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StalMineMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> STALMINE_TAB = CREATIVE_MODE_TABS.register("stalmine_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BOLT.get()))
                    .title(Component.translatable("creativetab.stalmine_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BOLT.get());
                        pOutput.accept(ModItems.KNIFE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
