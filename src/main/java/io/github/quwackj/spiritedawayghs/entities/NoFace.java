package io.github.quwackj.spiritedawayghs.entities;

import io.github.quwackj.spiritedawayghs.init.ModEntitiesInit;
import io.github.quwackj.spiritedawayghs.item.ModItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.NeutralMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.FlyingAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class NoFace extends Animal {

    public NoFace(EntityType<? extends Animal> type, Level level) {super(type, level);}

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel level, AgeableMob mob) {
        return ModEntitiesInit.NOFACE.get().create(level);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new TemptGoal(this, 1.0D, Ingredient.of(ModItems.COOKED_DUMPLINGS.get()), false));
        this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, 30.0F));
        this.goalSelector.addGoal(3, new FloatGoal(this));
        this.goalSelector.addGoal(4, new WaterAvoidingRandomStrollGoal(this, 0.6D));
    }

    public static AttributeSupplier.Builder getNoFaceAttributes() {
        return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 30.0D).add(Attributes.MOVEMENT_SPEED, (double)0.4F);
    }

}
