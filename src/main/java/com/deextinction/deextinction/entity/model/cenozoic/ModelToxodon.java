package  com.deextinction.deextinction.entity.model.cenozoic;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * ModelToxodon - Bizarre
 * Created using Tabula 7.0.0
 */
public class ModelToxodon extends ModelBase {
    public ModelRenderer Body1;
    public ModelRenderer rleftJoint;
    public ModelRenderer rrightJoint;
    public ModelRenderer fleftJoint;
    public ModelRenderer frightJoint;
    public ModelRenderer Body2;
    public ModelRenderer Body1up;
    public ModelRenderer Tail1;
    public ModelRenderer NeckMid;
    public ModelRenderer NeckUp;
    public ModelRenderer NeckUp_1;
    public ModelRenderer Head1;
    public ModelRenderer LeftEar;
    public ModelRenderer RightEar;
    public ModelRenderer UpperJaw1;
    public ModelRenderer LowerJaw1;
    public ModelRenderer UpperJaw2;
    public ModelRenderer UpperJaw3;
    public ModelRenderer LowerJaw2;
    public ModelRenderer Tail2;
    public ModelRenderer BackLegLeft1;
    public ModelRenderer BackLegLeft2;
    public ModelRenderer LeftBackFoot;
    public ModelRenderer BackLegright1;
    public ModelRenderer BackLegRightt2;
    public ModelRenderer RightBackFoot;
    public ModelRenderer FrontLegLeft1;
    public ModelRenderer FrontLegLeft2;
    public ModelRenderer FrontLeftFoot;
    public ModelRenderer FrontLegRight1;
    public ModelRenderer FrontLegRight2;
    public ModelRenderer FrontRightFoot;

    public ModelToxodon() {
        this.textureWidth = 200;
        this.textureHeight = 50;
        this.rleftJoint = new ModelRenderer(this, 0, 0);
        this.rleftJoint.setRotationPoint(2.3F, 0.6F, 9.7F);
        this.rleftJoint.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.BackLegLeft2 = new ModelRenderer(this, 167, 23);
        this.BackLegLeft2.setRotationPoint(2.0F, 7.0F, -2.6F);
        this.BackLegLeft2.addBox(-1.5F, 0.0F, 0.0F, 3, 7, 4, 0.0F);
        this.setRotateAngle(BackLegLeft2, 0.6373942428283291F, 0.0F, 0.0F);
        this.NeckMid = new ModelRenderer(this, 123, 0);
        this.NeckMid.setRotationPoint(0.0F, -7.0F, -6.0F);
        this.NeckMid.addBox(-3.0F, -3.0F, -7.0F, 6, 6, 8, 0.0F);
        this.Head1 = new ModelRenderer(this, 46, 15);
        this.Head1.setRotationPoint(0.0F, -3.4F, -5.5F);
        this.Head1.addBox(-3.5F, 0.0F, -6.0F, 7, 7, 6, 0.0F);
        this.setRotateAngle(Head1, 0.136659280431156F, 0.0F, 0.0F);
        this.FrontLegLeft1 = new ModelRenderer(this, 151, 0);
        this.FrontLegLeft1.setRotationPoint(2.0F, -0.9F, -1.0F);
        this.FrontLegLeft1.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(FrontLegLeft1, 0.4166100924510465F, 0.22689280275926282F, -0.10471975511965977F);
        this.RightBackFoot = new ModelRenderer(this, 181, 23);
        this.RightBackFoot.setRotationPoint(0.0F, 6.7F, 4.0F);
        this.RightBackFoot.addBox(-2.0F, 0.0F, -4.5F, 4, 3, 5, 0.0F);
        this.setRotateAngle(RightBackFoot, -0.2792526803190927F, 0.0F, 0.0F);
        this.FrontRightFoot = new ModelRenderer(this, 163, 11);
        this.FrontRightFoot.setRotationPoint(0.0F, 4.6F, 0.1F);
        this.FrontRightFoot.addBox(-2.0F, 0.0F, -3.5F, 4, 2, 4, 0.0F);
        this.setRotateAngle(FrontRightFoot, 0.4553564018453205F, 0.0F, 0.0F);
        this.Body2 = new ModelRenderer(this, 71, 0);
        this.Body2.setRotationPoint(0.0F, 9.0F, -14.0F);
        this.Body2.addBox(-3.5F, -14.0F, -6.0F, 7, 14, 6, 0.0F);
        this.setRotateAngle(Body2, -0.091106186954104F, 0.0F, 0.0F);
        this.Tail1 = new ModelRenderer(this, 0, 0);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail1.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(Tail1, 0.594982742004867F, 0.0F, 0.0F);
        this.NeckUp = new ModelRenderer(this, 143, 12);
        this.NeckUp.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.NeckUp.addBox(-2.5F, 0.0F, -8.0F, 5, 6, 8, 0.0F);
        this.setRotateAngle(NeckUp, 0.5113814708343385F, 0.0F, 0.0F);
        this.LowerJaw1 = new ModelRenderer(this, 91, 0);
        this.LowerJaw1.setRotationPoint(0.0F, 5.0F, -5.1F);
        this.LowerJaw1.addBox(-2.0F, 0.0F, -5.0F, 4, 1, 5, 0.0F);
        this.setRotateAngle(LowerJaw1, -0.136659280431156F, 0.0F, 0.0F);
        this.frightJoint = new ModelRenderer(this, 0, 0);
        this.frightJoint.setRotationPoint(-1.6F, 6.4F, -12.9F);
        this.frightJoint.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.BackLegLeft1 = new ModelRenderer(this, 31, 0);
        this.BackLegLeft1.setRotationPoint(0.0F, 1.0F, 1.4F);
        this.BackLegLeft1.addBox(0.0F, -2.0F, -3.0F, 4, 9, 6, 0.0F);
        this.setRotateAngle(BackLegLeft1, -0.3490658503988659F, -0.13962634015954636F, 0.0F);
        this.LeftBackFoot = new ModelRenderer(this, 181, 23);
        this.LeftBackFoot.setRotationPoint(0.0F, 6.7F, 4.0F);
        this.LeftBackFoot.addBox(-2.0F, 0.0F, -4.5F, 4, 3, 5, 0.0F);
        this.setRotateAngle(LeftBackFoot, -0.2792526803190927F, 0.0F, 0.0F);
        this.BackLegRightt2 = new ModelRenderer(this, 167, 23);
        this.BackLegRightt2.setRotationPoint(-2.0F, 7.0F, -2.6F);
        this.BackLegRightt2.addBox(-1.5F, 0.0F, 0.0F, 3, 7, 4, 0.0F);
        this.setRotateAngle(BackLegRightt2, 0.6373942428283291F, 0.0F, 0.0F);
        this.RightEar = new ModelRenderer(this, 31, 0);
        this.RightEar.setRotationPoint(-3.0F, 0.8F, -2.3F);
        this.RightEar.addBox(-1.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(RightEar, -0.7740535232594852F, 0.136659280431156F, -0.7285004297824331F);
        this.Tail2 = new ModelRenderer(this, 123, 0);
        this.Tail2.setRotationPoint(0.0F, 1.8F, 0.4F);
        this.Tail2.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
        this.setRotateAngle(Tail2, -0.4476769531365455F, 0.0F, 0.0F);
        this.BackLegright1 = new ModelRenderer(this, 31, 0);
        this.BackLegright1.setRotationPoint(0.0F, 1.0F, 1.4F);
        this.BackLegright1.addBox(-4.0F, -2.0F, -3.0F, 4, 9, 6, 0.0F);
        this.setRotateAngle(BackLegright1, -0.3490658503988659F, 0.13962634015954636F, 0.0F);
        this.FrontLegLeft2 = new ModelRenderer(this, 0, 4);
        this.FrontLegLeft2.setRotationPoint(0.0F, 7.0F, 1.0F);
        this.FrontLegLeft2.addBox(-1.5F, -1.0F, -2.5F, 3, 7, 3, 0.0F);
        this.setRotateAngle(FrontLegLeft2, -0.8651597102135892F, -0.03490658503988659F, 0.12217304763960307F);
        this.Body1 = new ModelRenderer(this, 0, 0);
        this.Body1.setRotationPoint(0.0F, -4.5F, 15.2F);
        this.Body1.addBox(-4.0F, -1.0F, -14.0F, 8, 10, 15, 0.0F);
        this.setRotateAngle(Body1, 0.13962634015954636F, 0.0F, 0.0F);
        this.fleftJoint = new ModelRenderer(this, 0, 0);
        this.fleftJoint.setRotationPoint(1.6F, 6.4F, -12.9F);
        this.fleftJoint.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.NeckUp_1 = new ModelRenderer(this, 171, 11);
        this.NeckUp_1.setRotationPoint(0.0F, 5.2F, 0.0F);
        this.NeckUp_1.addBox(-2.5F, -3.0F, -9.0F, 5, 3, 9, 0.0F);
        this.setRotateAngle(NeckUp_1, -0.19268434942017396F, 0.0F, 0.0F);
        this.rrightJoint = new ModelRenderer(this, 0, 0);
        this.rrightJoint.setRotationPoint(-2.3F, 0.6F, 9.7F);
        this.rrightJoint.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.UpperJaw2 = new ModelRenderer(this, 183, 0);
        this.UpperJaw2.setRotationPoint(0.0F, -2.0F, 0.4F);
        this.UpperJaw2.addBox(-2.5F, 0.0F, -3.0F, 5, 2, 3, 0.0F);
        this.setRotateAngle(UpperJaw2, 0.16755160819145562F, 0.0F, 0.0F);
        this.FrontLegRight1 = new ModelRenderer(this, 151, 0);
        this.FrontLegRight1.setRotationPoint(-2.0F, -0.9F, -1.0F);
        this.FrontLegRight1.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(FrontLegRight1, 0.4166100924510465F, -0.22689280275926282F, 0.10471975511965977F);
        this.LowerJaw2 = new ModelRenderer(this, 115, 18);
        this.LowerJaw2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.LowerJaw2.addBox(-1.5F, -1.0F, -5.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(LowerJaw2, -0.20245819323134223F, 0.0F, 0.0F);
        this.LeftEar = new ModelRenderer(this, 31, 0);
        this.LeftEar.mirror = true;
        this.LeftEar.setRotationPoint(3.0F, 1.0F, -2.0F);
        this.LeftEar.addBox(-1.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(LeftEar, -0.7740535232594852F, -0.136659280431156F, 0.7285004297824331F);
        this.FrontLeftFoot = new ModelRenderer(this, 163, 11);
        this.FrontLeftFoot.setRotationPoint(0.0F, 4.6F, 0.1F);
        this.FrontLeftFoot.addBox(-2.0F, 0.0F, -3.5F, 4, 2, 4, 0.0F);
        this.setRotateAngle(FrontLeftFoot, 0.4553564018453205F, 0.0F, 0.0F);
        this.UpperJaw1 = new ModelRenderer(this, 92, 18);
        this.UpperJaw1.setRotationPoint(0.0F, 2.0F, -5.0F);
        this.UpperJaw1.addBox(-3.0F, 0.0F, -5.0F, 6, 3, 5, 0.0F);
        this.setRotateAngle(UpperJaw1, -0.091106186954104F, 0.0F, 0.0F);
        this.Body1up = new ModelRenderer(this, 97, 0);
        this.Body1up.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Body1up.addBox(-3.0F, 0.0F, -14.0F, 6, 4, 14, 0.0F);
        this.setRotateAngle(Body1up, -0.296705972839036F, 0.0F, 0.0F);
        this.UpperJaw3 = new ModelRenderer(this, 183, 5);
        this.UpperJaw3.setRotationPoint(0.0F, 0.0F, -2.9F);
        this.UpperJaw3.addBox(-2.5F, 0.0F, -3.0F, 5, 2, 3, 0.0F);
        this.setRotateAngle(UpperJaw3, 0.39444441095071847F, 0.0F, 0.0F);
        this.FrontLegRight2 = new ModelRenderer(this, 0, 4);
        this.FrontLegRight2.setRotationPoint(0.0F, 7.0F, 1.0F);
        this.FrontLegRight2.addBox(-1.5F, -1.0F, -2.5F, 3, 7, 3, 0.0F);
        this.setRotateAngle(FrontLegRight2, -0.8651597102135892F, 0.03490658503988659F, -0.12217304763960307F);
        this.BackLegLeft1.addChild(this.BackLegLeft2);
        this.Body2.addChild(this.NeckMid);
        this.NeckMid.addChild(this.Head1);
        this.fleftJoint.addChild(this.FrontLegLeft1);
        this.BackLegRightt2.addChild(this.RightBackFoot);
        this.FrontLegRight2.addChild(this.FrontRightFoot);
        this.Body1.addChild(this.Body2);
        this.Body1.addChild(this.Tail1);
        this.NeckMid.addChild(this.NeckUp);
        this.Head1.addChild(this.LowerJaw1);
        this.rleftJoint.addChild(this.BackLegLeft1);
        this.BackLegLeft2.addChild(this.LeftBackFoot);
        this.BackLegright1.addChild(this.BackLegRightt2);
        this.Head1.addChild(this.RightEar);
        this.Tail1.addChild(this.Tail2);
        this.rrightJoint.addChild(this.BackLegright1);
        this.FrontLegLeft1.addChild(this.FrontLegLeft2);
        this.NeckMid.addChild(this.NeckUp_1);
        this.UpperJaw1.addChild(this.UpperJaw2);
        this.frightJoint.addChild(this.FrontLegRight1);
        this.LowerJaw1.addChild(this.LowerJaw2);
        this.Head1.addChild(this.LeftEar);
        this.FrontLegLeft2.addChild(this.FrontLeftFoot);
        this.Head1.addChild(this.UpperJaw1);
        this.Body1.addChild(this.Body1up);
        this.UpperJaw2.addChild(this.UpperJaw3);
        this.FrontLegRight1.addChild(this.FrontLegRight2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.rleftJoint.offsetX, this.rleftJoint.offsetY, this.rleftJoint.offsetZ);
        GlStateManager.translate(this.rleftJoint.rotationPointX * f5, this.rleftJoint.rotationPointY * f5, this.rleftJoint.rotationPointZ * f5);
        GlStateManager.scale(1.6D, 1.6D, 1.6D);
        GlStateManager.translate(-this.rleftJoint.offsetX, -this.rleftJoint.offsetY, -this.rleftJoint.offsetZ);
        GlStateManager.translate(-this.rleftJoint.rotationPointX * f5, -this.rleftJoint.rotationPointY * f5, -this.rleftJoint.rotationPointZ * f5);
        this.rleftJoint.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.frightJoint.offsetX, this.frightJoint.offsetY, this.frightJoint.offsetZ);
        GlStateManager.translate(this.frightJoint.rotationPointX * f5, this.frightJoint.rotationPointY * f5, this.frightJoint.rotationPointZ * f5);
        GlStateManager.scale(1.6D, 1.6D, 1.6D);
        GlStateManager.translate(-this.frightJoint.offsetX, -this.frightJoint.offsetY, -this.frightJoint.offsetZ);
        GlStateManager.translate(-this.frightJoint.rotationPointX * f5, -this.frightJoint.rotationPointY * f5, -this.frightJoint.rotationPointZ * f5);
        this.frightJoint.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Body1.offsetX, this.Body1.offsetY, this.Body1.offsetZ);
        GlStateManager.translate(this.Body1.rotationPointX * f5, this.Body1.rotationPointY * f5, this.Body1.rotationPointZ * f5);
        GlStateManager.scale(1.6D, 1.6D, 1.6D);
        GlStateManager.translate(-this.Body1.offsetX, -this.Body1.offsetY, -this.Body1.offsetZ);
        GlStateManager.translate(-this.Body1.rotationPointX * f5, -this.Body1.rotationPointY * f5, -this.Body1.rotationPointZ * f5);
        this.Body1.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.fleftJoint.offsetX, this.fleftJoint.offsetY, this.fleftJoint.offsetZ);
        GlStateManager.translate(this.fleftJoint.rotationPointX * f5, this.fleftJoint.rotationPointY * f5, this.fleftJoint.rotationPointZ * f5);
        GlStateManager.scale(1.6D, 1.6D, 1.6D);
        GlStateManager.translate(-this.fleftJoint.offsetX, -this.fleftJoint.offsetY, -this.fleftJoint.offsetZ);
        GlStateManager.translate(-this.fleftJoint.rotationPointX * f5, -this.fleftJoint.rotationPointY * f5, -this.fleftJoint.rotationPointZ * f5);
        this.fleftJoint.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.rrightJoint.offsetX, this.rrightJoint.offsetY, this.rrightJoint.offsetZ);
        GlStateManager.translate(this.rrightJoint.rotationPointX * f5, this.rrightJoint.rotationPointY * f5, this.rrightJoint.rotationPointZ * f5);
        GlStateManager.scale(1.6D, 1.6D, 1.6D);
        GlStateManager.translate(-this.rrightJoint.offsetX, -this.rrightJoint.offsetY, -this.rrightJoint.offsetZ);
        GlStateManager.translate(-this.rrightJoint.rotationPointX * f5, -this.rrightJoint.rotationPointY * f5, -this.rrightJoint.rotationPointZ * f5);
        this.rrightJoint.render(f5);
        GlStateManager.popMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFator, Entity entityIn )
    {
    	this.frightJoint.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F ) * 0.4F * limbSwingAmount;
    	this.rrightJoint.rotateAngleX = MathHelper.cos(limbSwing  * 0.6662F + (float)Math.PI) * 0.5F * limbSwingAmount;

    
    	
    	this.fleftJoint.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI ) * 0.5F * limbSwingAmount;
    	this.rleftJoint.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F ) * 0.4F * limbSwingAmount;
    }
}
