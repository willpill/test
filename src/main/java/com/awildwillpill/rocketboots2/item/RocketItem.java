
package com.awildwillpill.rocketboots2.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import java.util.Map;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

import com.awildwillpill.rocketboots2.procedures.RocketBootsTickEventProcedure;
import com.awildwillpill.rocketboots2.RocketBoots2ModElements;

@RocketBoots2ModElements.ModElement.Tag
public class RocketItem extends RocketBoots2ModElements.ModElement {
	@ObjectHolder("rocket_boots_2:rocket_helmet")
	public static final Item helmet = null;
	@ObjectHolder("rocket_boots_2:rocket_chestplate")
	public static final Item body = null;
	@ObjectHolder("rocket_boots_2:rocket_leggings")
	public static final Item legs = null;
	@ObjectHolder("rocket_boots_2:rocket_boots")
	public static final Item boots = null;
	public RocketItem(RocketBoots2ModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 9;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "rocket";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.TRANSPORTATION)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedLeftLeg = new ModelrocketbootsmodelTest().RightLeg;
				armorModel.bipedRightLeg = new ModelrocketbootsmodelTest().RightLeg;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "rocket_boots_2:textures/rocketbootstexture.png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					RocketBootsTickEventProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("rocket_boots"));
	}
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
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
