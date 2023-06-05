package client.models;// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import io.github.quwackj.spiritedawayghs.entities.NoFace;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class NoFaceModel extends EntityModel<NoFace> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "noface"), "main");
	private final ModelPart body;
	private final ModelPart mask;

	public NoFaceModel(ModelPart root) {
		this.body = root.getChild("body");
		this.mask = root.getChild("mask");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -34.0F, -5.0F, 10.0F, 31.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(28, 0).addBox(-4.0F, -36.0F, -4.0F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 1.0F));

		PartDefinition mask = partdefinition.addOrReplaceChild("mask", CubeListBuilder.create().texOffs(36, 8).addBox(-4.0F, -35.0F, -5.0F, 8.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 18).addBox(-3.0F, -36.0F, -5.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(NoFace entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, 0.3F);
		mask.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}