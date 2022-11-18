// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class xp<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "xp"), "main");
	private final ModelPart bone7;
	private final ModelPart bone6;

	public xp(ModelPart root) {
		this.bone7 = root.getChild("bone7");
		this.bone6 = root.getChild("bone6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone7 = partdefinition.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(-3.0F, -2.0F, 0.0F));

		PartDefinition bone2 = bone7.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(30, 22).addBox(-4.0F, -8.0F, 0.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 13).addBox(-2.0F, -9.0F, 0.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 4).addBox(-6.0F, -9.0F, 0.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 4).addBox(-7.0F, -10.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 24).addBox(-1.0F, -10.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 35).addBox(0.0F, -9.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.014F, 0.0242F, 0.1281F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(24, 26).addBox(4.0F, -17.0F, 0.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 26).addBox(6.0F, -18.0F, 0.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 26).addBox(2.0F, -18.0F, 0.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 33).addBox(1.0F, -19.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 22).addBox(7.0F, -19.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 35).addBox(8.0F, -18.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.5534F, -29.6961F, 0.6672F, 0.0447F, -0.0042F, -3.097F));

		PartDefinition bone = bone7.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone4 = bone.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(6, 24).addBox(-4.0895F, 12.6182F, 0.3365F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(-2.0895F, 11.6182F, 0.3365F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 17).addBox(-6.0895F, 11.6182F, 0.3365F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 33).addBox(-7.0895F, 10.6182F, 0.3365F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 35).addBox(-1.0895F, 10.6182F, 0.3365F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 35).addBox(-0.0895F, 11.6182F, 0.3365F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -30.0F, -1.0F, 0.0196F, -0.0203F, 0.1166F));

		PartDefinition bone5 = bone7.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(22, 8).addBox(3.9105F, -11.6182F, 0.3365F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 17).addBox(5.9105F, -10.6182F, 0.3365F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 8).addBox(1.9105F, -10.6182F, 0.3365F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 33).addBox(0.9105F, -9.6182F, 0.3365F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 20).addBox(6.9105F, -2.6182F, 0.3365F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 13).addBox(7.9105F, -8.6182F, 0.3365F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.0F, -1.0F, -0.0016F, 0.0012F, 0.0872F));

		PartDefinition bone6 = partdefinition.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(16, 4).addBox(-4.0F, -20.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(8, 4).addBox(-6.0F, -19.0F, -1.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(30, 31).addBox(-3.0F, -25.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-11.0F, -27.0F, -1.0F, 18.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 4).addBox(0.0F, -19.0F, -1.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 25.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone7.render(poseStack, buffer, packedLight, packedOverlay);
		bone6.render(poseStack, buffer, packedLight, packedOverlay);
	}
}