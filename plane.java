// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class plane<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "plane"), "main");
	private final ModelPart bb_main;

	public plane(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 25).addBox(-1.0F, -8.0F, -5.0F, 2.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(37, 15).addBox(-1.0F, -7.0F, 1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 23).addBox(-1.0F, -7.0F, -6.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 19).addBox(-1.0F, -8.0F, 14.0F, 2.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(34, 33).addBox(-1.0F, -7.0F, 20.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 33).addBox(-1.0F, -7.0F, 13.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(31, 15).addBox(-2.0F, -10.0F, 16.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 13).addBox(1.0F, -10.0F, 16.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(15, 13).addBox(-6.0F, -19.0F, 3.0F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 0).addBox(-3.0F, -14.0F, 7.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-2.0F, -10.0F, 4.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(16, 0).addBox(-2.0F, -6.0F, 15.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(15, 15).addBox(-4.0F, -8.0F, 6.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 0).addBox(-1.0F, 8.0F, 6.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -14.0F, 3.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(30, 6).addBox(-1.0F, -4.0F, 9.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -14.0F, 3.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 13).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -14.0F, 3.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(15, 17).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.0F, 1.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(16, 31).addBox(3.0F, -10.0F, -1.0F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 33).addBox(0.0F, -10.0F, -1.0F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -4.0F, -2.0F, -0.48F, 0.0F, 0.0F));

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