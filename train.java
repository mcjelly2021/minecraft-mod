// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class train<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "train"), "main");
	private final ModelPart bb_main;

	public train(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 19).addBox(-8.0F, -5.0F, -8.0F, 48.0F, 3.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(38, 71).addBox(-8.0F, -21.0F, -8.0F, 3.0F, 16.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 71).addBox(37.0F, -35.0F, -8.0F, 3.0F, 30.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(62, 38).addBox(9.0F, -35.0F, -8.0F, 28.0F, 30.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 38).addBox(9.0F, -35.0F, 5.0F, 28.0F, 30.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.0F, -38.0F, -8.0F, 48.0F, 3.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 19).addBox(-8.0F, -35.0F, 6.0F, 3.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.0F, -35.0F, -8.0F, 3.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(76, 90).addBox(-5.0F, -21.0F, 5.0F, 14.0F, 16.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(76, 71).addBox(-5.0F, -21.0F, -8.0F, 14.0F, 16.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(42, 71).addBox(-6.0F, -3.0F, -9.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 71).addBox(-6.0F, -3.0F, 7.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 71).addBox(35.0F, -3.0F, -9.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 71).addBox(35.0F, -3.0F, 7.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}