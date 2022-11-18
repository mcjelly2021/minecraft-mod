// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class custom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart bb_main;

	public custom_model(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(5, 9).addBox(-6.0F, -3.0F, 4.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 6).addBox(-6.0F, -3.0F, -6.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(5, 3).addBox(5.0F, -3.0F, 4.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(5.0F, -3.0F, -6.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(-5.0F, -4.0F, -7.0F, 10.0F, 2.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(39, 0).addBox(-6.0F, -4.0F, -3.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(35, 21).addBox(5.0F, -4.0F, -3.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.0F, -5.0F, -7.0F, 12.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(35, 16).addBox(-6.0F, -9.0F, 7.0F, 12.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(15, 33).addBox(-6.0F, -9.0F, -7.0F, 12.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 33).addBox(5.0F, -9.0F, -6.0F, 1.0F, 4.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(0, 33).addBox(-6.0F, -9.0F, -6.0F, 1.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}