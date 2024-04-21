package noobanidus.mods.createstuffadditionsfix.mixins;

import net.mcreator.createstuffadditions.procedures.FuelAndFillPrProcedure;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(FuelAndFillPrProcedure.class)
public class MixinFuelAndFillPrProcedure {
  private static CompoundTag tempCreate (ItemStack stack) {
    if (!stack.hasTag()) {
      return new CompoundTag();
    }

    return stack.getTag();
  }

  @Redirect(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;Lnet/minecraft/world/item/ItemStack;)V", at=@At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;getOrCreateTag()Lnet/minecraft/nbt/CompoundTag;", ordinal=0))
  private static CompoundTag CreateStuffAdditionsFixFirst(ItemStack instance) {
    return tempCreate(instance);
  }

  @Redirect(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;Lnet/minecraft/world/item/ItemStack;)V", at=@At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;getOrCreateTag()Lnet/minecraft/nbt/CompoundTag;", ordinal=2))
  private static CompoundTag CreateStuffAdditionsFixSecond(ItemStack instance) {
    return tempCreate(instance);
  }

  @Redirect(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;Lnet/minecraft/world/item/ItemStack;)V", at=@At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;getOrCreateTag()Lnet/minecraft/nbt/CompoundTag;", ordinal=4))
  private static CompoundTag CreateStuffAdditionsFixFourth(ItemStack instance) {
    return tempCreate(instance);
  }

  @Redirect(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;Lnet/minecraft/world/item/ItemStack;)V", at=@At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;getOrCreateTag()Lnet/minecraft/nbt/CompoundTag;", ordinal=5))
  private static CompoundTag CreateStuffAdditionsFixFifth(ItemStack instance) {
    return tempCreate(instance);
  }

  @Redirect(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;Lnet/minecraft/world/item/ItemStack;)V", at=@At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;getOrCreateTag()Lnet/minecraft/nbt/CompoundTag;", ordinal=7))
  private static CompoundTag CreateStuffAdditionsFixSeventh(ItemStack instance) {
    return tempCreate(instance);
  }

  @Redirect(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;Lnet/minecraft/world/item/ItemStack;)V", at=@At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;getOrCreateTag()Lnet/minecraft/nbt/CompoundTag;", ordinal=9))
  private static CompoundTag CreateStuffAdditionsFixNinth(ItemStack instance) {
    return tempCreate(instance);
  }

  @Redirect(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;Lnet/minecraft/world/item/ItemStack;)V", at=@At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;getOrCreateTag()Lnet/minecraft/nbt/CompoundTag;", ordinal=10))
  private static CompoundTag CreateStuffAdditionsFixTenth(ItemStack instance) {
    return tempCreate(instance);
  }
}
