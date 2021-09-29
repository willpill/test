// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class ModelrocketbootsmodelTest extends EntityModel<Entity> {
	private final ModelRenderer RightLeg;
	private final ModelRenderer cube_r1;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer cube_r2;

	public ModelrocketbootsmodelTest() {
		textureWidth = 32;
		textureHeight = 32;

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-2.25F, 12.0F, 0.75F);
		RightLeg.setTextureOffset(0, 0).addBox(-2.5F, 7.1F, -3.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(4.5F, 12.0F, 3.25F);
		RightLeg.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.5236F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(18, 8).addBox(-6.0F, -4.4051F, -0.8835F, 3.0F, 4.0F, 2.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(6.75F, 12.0F, 0.745F);
		LeftLeg.setTextureOffset(0, 0).addBox(-3.0F, 7.1F, -3.005F, 5.0F, 5.0F, 5.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 12.0F, 3.255F);
		LeftLeg.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.5236F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(18, 8).addBox(-2.0F, -4.4051F, -0.8835F, 3.0F, 4.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}