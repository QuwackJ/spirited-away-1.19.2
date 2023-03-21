package io.github.quwackj.spiritedawayghs.entity;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.DeferredRegister;
import org.jetbrains.annotations.Nullable;

public class ModEntityTypes extends Animal {
    protected ModEntityTypes(EntityType<? extends Animal> animal, Level level) {
        super(animal, level);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel level, AgeableMob entity) {
        return null;
    }
}
