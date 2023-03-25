package io.github.quwackj.spiritedawayghs.entities;

import io.github.quwackj.spiritedawayghs.initializer.ModEntities;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class OtoriSama extends Animal {

    public OtoriSama(EntityType<? extends Animal> entityType, Level level) {
        super(entityType, level);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
        return ModEntities.OTORI_SAMA.get().create(serverLevel);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new FloatGoal(this));
        // put something here
        this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, 10.0F));
    }
}
