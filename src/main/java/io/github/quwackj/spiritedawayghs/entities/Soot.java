package io.github.quwackj.spiritedawayghs.entities;

import io.github.quwackj.spiritedawayghs.init.ModEntitiesInit;
import io.github.quwackj.spiritedawayghs.item.ModItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.ForgeMod;
import org.jetbrains.annotations.Nullable;

public class Soot extends Animal {

    public Soot(EntityType<? extends Animal> type, Level level) {
        super(type, level);
    }
    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel level, AgeableMob mob) {
        return ModEntitiesInit.SOOT.get().create(level);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.0D, Ingredient.of(ModItems.GREEN_KONPEITO.get(), ModItems.RED_KONPEITO.get(), ModItems.WHITE_KONPEITO.get(), ModItems.YELLOW_KONPEITO.get()), false));
        this.goalSelector.addGoal(6, new WaterAvoidingRandomStrollGoal(this, 0.6D));
        this.goalSelector.addGoal(11, new LookAtPlayerGoal(this, Player.class, 10.0F));
    }

    public static AttributeSupplier.Builder getSootAttributes() {
        return Mob.createMobAttributes().add(ForgeMod.ENTITY_GRAVITY.get(), 1.5f).add(Attributes.MAX_HEALTH, 2.00);
    }
}
