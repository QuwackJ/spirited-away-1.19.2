package client.models;// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import io.github.quwackj.spiritedawayghs.SpiritedAwayGHS;
import io.github.quwackj.spiritedawayghs.entities.OtoriSama;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class OtoriLeafModel extends OtoriModel {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(SpiritedAwayGHS.MOD_ID, "otorisama"), "main");
	private final ModelPart leaf;
	//private final ModelPart body;

	public OtoriLeafModel(ModelPart root) {
		super(root);
		this.leaf = root.getChild("leaf");
		//this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition leaf = partdefinition.addOrReplaceChild("leaf", CubeListBuilder.create().texOffs(66, 0).addBox(4.0F, -32.0F, -6.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(76, 0).addBox(-5.0F, -32.0F, -5.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(66, 3).addBox(-7.0F, -32.0F, -4.0F, 13.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(66, 13).addBox(-8.0F, -32.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(73, 14).addBox(6.0F, -32.0F, -3.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(100, 3).addBox(-6.0F, -32.0F, 4.0F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(101, 6).addBox(-5.0F, -32.0F, 5.0F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(106, 9).addBox(-4.0F, -32.0F, 6.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(108, 12).addBox(-4.0F, -32.0F, 7.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(86, 15).addBox(-3.0F, -32.0F, 8.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(67, 3).addBox(-7.0F, -32.0F, 9.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(67, 7).addBox(-7.0F, -32.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(75, 14).addBox(-6.0F, -32.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(67, 14).addBox(7.0F, -31.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 15.0F, -3.0F));

		/*PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(10, 10).addBox(-10.0F, -31.0F, -4.0F, 20.0F, 5.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(40, 60).addBox(10.0F, -26.0F, -4.0F, 5.0F, 35.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(-15.0F, -26.0F, -4.0F, 5.0F, 35.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-10.0F, -26.0F, -9.0F, 20.0F, 35.0F, 25.0F, new CubeDeformation(0.0F))
		.texOffs(20, 40).addBox(-10.0F, -11.0F, -14.0F, 20.0F, 15.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(55, 85).addBox(10.0F, -11.0F, -9.0F, 5.0F, 15.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(39, 82).addBox(-15.0F, -11.0F, -9.0F, 5.0F, 15.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 7).addBox(10.0F, 8.0F, -10.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-15.0F, 8.0F, -10.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(25, 60).addBox(-5.0F, -17.0F, -13.0F, 10.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(4, 36).addBox(15.0F, -10.0F, 0.0F, 2.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(4, 36).addBox(-17.0F, -10.0F, 0.0F, 2.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 15.0F, -4.0F));
*/
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(OtoriSama entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		leaf.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		//body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}