// Date: 5/28/2016 10:20:40 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package com.minecolonies.coremod.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;
import org.jetbrains.annotations.NotNull;

public class ModelScarecrowBoth extends Model
{
    //fields
    ModelRenderer head;
    ModelRenderer post;
    ModelRenderer leftArmPeg;
    ModelRenderer rightArmPeg;
    ModelRenderer torso;
    ModelRenderer rightLegPeg;
    ModelRenderer leftLegPeg;
    ModelRenderer leftArm;
    ModelRenderer rightArm;
    ModelRenderer rightLeg;
    ModelRenderer leftLeg;

    public ModelScarecrowBoth()
    {
        super(RenderType::entityCutoutNoCull);
        texWidth = 128;
        texHeight = 64;
        head = new ModelRenderer(this, 0, 0);
        head.addBox(-8.2F, -35.6F, -4.2F, 8, 8, 8);
        head.setPos(7F, 24F, -1F);
        head.setTexSize(128, 64);
        head.mirror = true;
        setRotation(head, 0F, 0.1858931F, -0.1092638F);
        post = new ModelRenderer(this, 0, 32);
        post.addBox(-1F, -16F, -1F, 2, 16, 2);
        post.setPos(0F, 24F, 0F);
        post.setTexSize(128, 64);
        post.mirror = true;
        setRotation(post, 0F, 0F, 0F);
        leftArmPeg = new ModelRenderer(this, 9, 33);
        leftArmPeg.addBox(23.5F, 1F, -1F, 2, 2, 2);
        leftArmPeg.setPos(7F, 24F, 0F);
        leftArmPeg.setTexSize(128, 64);
        leftArmPeg.mirror = true;
        setRotation(leftArmPeg, 0F, 0F, -1.351339F);
        rightArmPeg = new ModelRenderer(this, 9, 33);
        rightArmPeg.addBox(-28F, 15.8F, -1F, 2, 2, 2);
        rightArmPeg.setPos(7F, 24F, 0F);
        rightArmPeg.setTexSize(128, 64);
        rightArmPeg.mirror = true;
        setRotation(rightArmPeg, 0F, 0F, 1.351339F);
        torso = new ModelRenderer(this, 16, 16);
        torso.addBox(-10.3F, -27.6F, -2F, 8, 12, 4);
        torso.setPos(7F, 24F, 0F);
        torso.setTexSize(128, 64);
        torso.mirror = true;
        setRotation(torso, 0F, 0F, -0.0349066F);
        rightLegPeg = new ModelRenderer(this, 9, 33);
        rightLegPeg.addBox(-11F, -4F, -1F, 2, 2, 2);
        rightLegPeg.setPos(7F, 24F, 0F);
        rightLegPeg.setTexSize(128, 64);
        rightLegPeg.mirror = true;
        setRotation(rightLegPeg, 0F, 0F, 0.0872665F);
        leftLegPeg = new ModelRenderer(this, 9, 33);
        leftLegPeg.addBox(-4.5F, -5F, -1F, 2, 2, 2);
        leftLegPeg.setPos(7F, 24F, 0F);
        leftLegPeg.setTexSize(128, 64);
        leftLegPeg.mirror = true;
        setRotation(leftLegPeg, 0F, 0F, -0.0872665F);
        leftArm = new ModelRenderer(this, 40, 16);
        leftArm.addBox(22.5F, -10F, -1.99F, 4, 12, 4);
        leftArm.setPos(7F, 24F, 0F);
        leftArm.setTexSize(128, 64);
        leftArm.mirror = true;
        setRotation(leftArm, 0F, 0F, -1.351339F);
        rightArm = new ModelRenderer(this, 40, 16);
        rightArm.addBox(-29F, 4.8F, -1.99F, 4, 12, 4);
        rightArm.setPos(7F, 24F, 0F);
        rightArm.setTexSize(128, 64);
        rightArm.mirror = true;
        setRotation(rightArm, 0F, 0F, 1.351339F);
        rightLeg = new ModelRenderer(this, 0, 16);
        rightLeg.addBox(-12F, -15F, -1.99F, 4, 12, 4);
        rightLeg.setPos(7F, 24F, 0F);
        rightLeg.setTexSize(128, 64);
        rightLeg.mirror = true;
        setRotation(rightLeg, 0F, 0F, 0.0872665F);
        leftLeg = new ModelRenderer(this, 0, 16);
        leftLeg.addBox(-5.5F, -16F, -1.98F, 4, 12, 4);
        leftLeg.setPos(7F, 24F, 0F);
        leftLeg.setTexSize(128, 64);
        leftLeg.mirror = true;
        setRotation(leftLeg, 0F, 0F, -0.0872665F);
    }

    private void setRotation(@NotNull final ModelRenderer model, final float x, final float y, final float z)
    {
        model.xRot = x;
        model.yRot = y;
        model.zRot = z;
    }

    @Override
    public void renderToBuffer(
      final MatrixStack stack,
      final IVertexBuilder iVertexBuilder,
      final int p_225598_3_,
      final int p_225598_4_,
      final float p_225598_5_,
      final float p_225598_6_,
      final float p_225598_7_,
      final float p_225598_8_)
    {
        head.render(stack, iVertexBuilder, p_225598_3_, p_225598_4_);
        post.render(stack, iVertexBuilder, p_225598_3_, p_225598_4_);
        leftArmPeg.render(stack, iVertexBuilder, p_225598_3_, p_225598_4_);
        rightArmPeg.render(stack, iVertexBuilder, p_225598_3_, p_225598_4_);
        torso.render(stack, iVertexBuilder, p_225598_3_, p_225598_4_);
        rightLegPeg.render(stack, iVertexBuilder, p_225598_3_, p_225598_4_);
        leftLegPeg.render(stack, iVertexBuilder, p_225598_3_, p_225598_4_);
        leftArm.render(stack, iVertexBuilder, p_225598_3_, p_225598_4_);
        rightArm.render(stack, iVertexBuilder, p_225598_3_, p_225598_4_);
        rightLeg.render(stack, iVertexBuilder, p_225598_3_, p_225598_4_);
        leftLeg.render(stack, iVertexBuilder, p_225598_3_, p_225598_4_);
    }
}