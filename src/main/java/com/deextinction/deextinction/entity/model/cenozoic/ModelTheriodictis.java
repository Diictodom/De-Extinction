package com.deextinction.deextinction.entity.model.cenozoic;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Theriodictis - BOTMON
 * Created using Tabula 7.0.0
 */
public class ModelTheriodictis extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer fleftjoint;
    public ModelRenderer frightjoint;
    public ModelRenderer rleftjoint;
    public ModelRenderer rrightjoint;
    public ModelRenderer rear;
    public ModelRenderer neck;
    public ModelRenderer backhair;
    public ModelRenderer backhair2;
    public ModelRenderer backhair3;
    public ModelRenderer tail1;
    public ModelRenderer tail2;
    public ModelRenderer head;
    public ModelRenderer topjaw;
    public ModelRenderer lowerjaw;
    public ModelRenderer rightear1;
    public ModelRenderer leftear1;
    public ModelRenderer snout;
    public ModelRenderer lowerjaw2;
    public ModelRenderer rightear2;
    public ModelRenderer rightear3;
    public ModelRenderer leftear2;
    public ModelRenderer leftear3;
    public ModelRenderer leftarm1;
    public ModelRenderer leftarm2;
    public ModelRenderer leftarm3;
    public ModelRenderer leftpaw;
    public ModelRenderer rightarm1;
    public ModelRenderer rightarm2;
    public ModelRenderer rightarm3;
    public ModelRenderer rightpaw;
    public ModelRenderer leftleg1;
    public ModelRenderer leftleg2;
    public ModelRenderer leftleg3;
    public ModelRenderer leftfoot;
    public ModelRenderer rightleg1;
    public ModelRenderer rightleg2;
    public ModelRenderer rightleg3;
    public ModelRenderer rightfoot;

    public ModelTheriodictis() {
        this.textureWidth = 150;
        this.textureHeight = 160;
        this.leftpaw = new ModelRenderer(this, 14, 145);
        this.leftpaw.setRotationPoint(0.0F, 2.9F, -0.1F);
        this.leftpaw.addBox(-1.5F, 0.0F, -2.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(leftpaw, 0.18203784098300857F, 0.0F, 0.0F);
        this.leftleg2 = new ModelRenderer(this, 17, 87);
        this.leftleg2.setRotationPoint(2.0F, 7.5F, 0.3F);
        this.leftleg2.addBox(-1.5F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(leftleg2, 0.4553564018453205F, 0.0F, 0.0F);
        this.rleftjoint = new ModelRenderer(this, 0, 0);
        this.rleftjoint.setRotationPoint(2.0F, 8.5F, 7.0F);
        this.rleftjoint.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.leftarm2 = new ModelRenderer(this, 16, 126);
        this.leftarm2.setRotationPoint(2.0F, 4.4F, 2.0F);
        this.leftarm2.addBox(-1.5F, 0.0F, -1.5F, 3, 6, 3, 0.0F);
        this.setRotateAngle(leftarm2, -0.27314402793711257F, 0.0F, 0.0F);
        this.rightear3 = new ModelRenderer(this, 74, 30);
        this.rightear3.setRotationPoint(0.0F, -0.8F, 0.2F);
        this.rightear3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.leftear2 = new ModelRenderer(this, 67, 25);
        this.leftear2.setRotationPoint(-0.5F, -3.0F, -1.3F);
        this.leftear2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.rightear1 = new ModelRenderer(this, 77, 19);
        this.rightear1.setRotationPoint(-2.1F, -2.3F, -0.8F);
        this.rightear1.addBox(-0.5F, -2.0F, -1.5F, 1, 2, 3, 0.0F);
        this.setRotateAngle(rightear1, -0.36425021489121656F, -1.0471975511965976F, -0.5009094953223726F);
        this.rightleg2 = new ModelRenderer(this, 0, 87);
        this.rightleg2.setRotationPoint(-2.0F, 7.5F, 0.3F);
        this.rightleg2.addBox(-1.5F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(rightleg2, 0.4553564018453205F, 0.0F, 0.0F);
        this.leftear1 = new ModelRenderer(this, 67, 19);
        this.leftear1.setRotationPoint(2.1F, -1.9F, -0.8F);
        this.leftear1.addBox(-0.5F, -2.0F, -1.5F, 1, 2, 3, 0.0F);
        this.setRotateAngle(leftear1, -0.36425021489121656F, 1.0471975511965976F, 0.36425021489121656F);
        this.fleftjoint = new ModelRenderer(this, 0, 0);
        this.fleftjoint.setRotationPoint(2.0F, 11.5F, -5.3F);
        this.fleftjoint.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.backhair2 = new ModelRenderer(this, 44, 59);
        this.backhair2.setRotationPoint(0.5F, -5.1F, -13.3F);
        this.backhair2.addBox(-1.2F, -1.0F, 0.0F, 1, 1, 10, 0.0F);
        this.setRotateAngle(backhair2, -0.091106186954104F, 0.0F, 0.0F);
        this.rear = new ModelRenderer(this, 0, 22);
        this.rear.setRotationPoint(0.0F, -0.5F, -0.5F);
        this.rear.addBox(-4.0F, -4.5F, 0.0F, 8, 9, 9, 0.0F);
        this.setRotateAngle(rear, -0.045553093477052F, 0.0F, 0.0F);
        this.backhair3 = new ModelRenderer(this, 43, 59);
        this.backhair3.setRotationPoint(-2.3F, -5.1F, -10.8F);
        this.backhair3.addBox(-1.0F, -1.0F, 0.0F, 2, 1, 10, 0.0F);
        this.setRotateAngle(backhair3, -0.091106186954104F, 0.0F, 0.0F);
        this.leftleg1 = new ModelRenderer(this, 20, 72);
        this.leftleg1.setRotationPoint(0.0F, -0.3F, -1.2F);
        this.leftleg1.addBox(0.0F, 0.0F, 0.0F, 4, 8, 5, 0.0F);
        this.setRotateAngle(leftleg1, -0.091106186954104F, 0.0F, 0.0F);
        this.tail1 = new ModelRenderer(this, 0, 42);
        this.tail1.setRotationPoint(0.0F, -3.1F, 7.0F);
        this.tail1.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 9, 0.0F);
        this.setRotateAngle(tail1, -0.7285004297824331F, 0.0F, 0.0F);
        this.rightleg3 = new ModelRenderer(this, 0, 98);
        this.rightleg3.setRotationPoint(0.0F, 4.5F, 2.0F);
        this.rightleg3.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(rightleg3, -0.5009094953223726F, 0.0F, 0.0F);
        this.backhair = new ModelRenderer(this, 43, 59);
        this.backhair.setRotationPoint(2.3F, -5.1F, -10.8F);
        this.backhair.addBox(-1.0F, -1.0F, 0.0F, 2, 1, 10, 0.0F);
        this.setRotateAngle(backhair, -0.091106186954104F, 0.0F, 0.0F);
        this.rightleg1 = new ModelRenderer(this, 0, 72);
        this.rightleg1.setRotationPoint(0.0F, -0.3F, -1.2F);
        this.rightleg1.addBox(-4.0F, 0.0F, 0.0F, 4, 8, 5, 0.0F);
        this.setRotateAngle(rightleg1, -0.091106186954104F, 0.0F, 0.0F);
        this.leftfoot = new ModelRenderer(this, 16, 107);
        this.leftfoot.setRotationPoint(0.0F, 3.3F, -0.2F);
        this.leftfoot.addBox(-1.5F, 0.0F, -2.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(leftfoot, 0.18203784098300857F, 0.0F, 0.0F);
        this.rightear2 = new ModelRenderer(this, 76, 25);
        this.rightear2.setRotationPoint(-0.5F, -3.0F, -1.3F);
        this.rightear2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.lowerjaw = new ModelRenderer(this, 36, 50);
        this.lowerjaw.setRotationPoint(0.0F, 0.4F, -3.3F);
        this.lowerjaw.addBox(-1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(lowerjaw, 0.5918411493512771F, 0.0F, 0.0F);
        this.rightarm2 = new ModelRenderer(this, 0, 126);
        this.rightarm2.setRotationPoint(-2.0F, 4.4F, 2.0F);
        this.rightarm2.addBox(-1.5F, 0.0F, -1.5F, 3, 6, 3, 0.0F);
        this.setRotateAngle(rightarm2, -0.27314402793711257F, 0.0F, 0.0F);
        this.rightarm1 = new ModelRenderer(this, 0, 115);
        this.rightarm1.setRotationPoint(0.0F, -1.1F, -2.2F);
        this.rightarm1.addBox(-4.0F, 0.0F, 0.0F, 4, 5, 4, 0.0F);
        this.setRotateAngle(rightarm1, 0.22759093446006054F, 0.0F, 0.0F);
        this.snout = new ModelRenderer(this, 40, 39);
        this.snout.setRotationPoint(0.0F, -1.3F, -4.9F);
        this.snout.addBox(-1.5F, 0.0F, 0.0F, 3, 2, 5, 0.0F);
        this.setRotateAngle(snout, 0.4553564018453205F, 0.0F, 0.0F);
        this.frightjoint = new ModelRenderer(this, 0, 0);
        this.frightjoint.setRotationPoint(-2.0F, 11.5F, -5.3F);
        this.frightjoint.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.rrightjoint = new ModelRenderer(this, 0, 0);
        this.rrightjoint.setRotationPoint(-2.0F, 8.5F, 7.0F);
        this.rrightjoint.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.leftear3 = new ModelRenderer(this, 67, 30);
        this.leftear3.setRotationPoint(0.0F, -0.8F, 0.2F);
        this.leftear3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.leftarm1 = new ModelRenderer(this, 18, 115);
        this.leftarm1.setRotationPoint(0.0F, -1.1F, -2.2F);
        this.leftarm1.addBox(0.0F, 0.0F, 0.0F, 4, 5, 4, 0.0F);
        this.setRotateAngle(leftarm1, 0.22759093446006054F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 44, 3);
        this.neck.setRotationPoint(0.0F, -1.4F, -7.3F);
        this.neck.addBox(-2.5F, -3.5F, -8.0F, 5, 6, 6, 0.0F);
        this.setRotateAngle(neck, -0.0439822971502571F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 42, 17);
        this.head.setRotationPoint(0.0F, -0.2F, -7.1F);
        this.head.addBox(-3.0F, -3.5F, -4.0F, 6, 6, 4, 0.0F);
        this.setRotateAngle(head, 0.22759093446006054F, 0.0F, 0.0F);
        this.leftarm3 = new ModelRenderer(this, 10, 137);
        this.leftarm3.setRotationPoint(0.0F, 5.3F, 0.1F);
        this.leftarm3.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(leftarm3, -0.136659280431156F, 0.0F, 0.0F);
        this.topjaw = new ModelRenderer(this, 43, 30);
        this.topjaw.setRotationPoint(0.0F, 0.0F, -3.2F);
        this.topjaw.addBox(-2.0F, -1.5F, -4.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(topjaw, -0.18203784098300857F, 0.0F, 0.0F);
        this.rightfoot = new ModelRenderer(this, 0, 107);
        this.rightfoot.setRotationPoint(0.0F, 3.3F, -0.2F);
        this.rightfoot.addBox(-1.5F, 0.0F, -2.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(rightfoot, 0.18203784098300857F, 0.0F, 0.0F);
        this.lowerjaw2 = new ModelRenderer(this, 38, 50);
        this.lowerjaw2.setRotationPoint(0.0F, 1.1F, 0.0F);
        this.lowerjaw2.addBox(-1.0F, 0.0F, -4.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(lowerjaw2, -0.27314402793711257F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 11.7F, 3.0F);
        this.body.addBox(-4.5F, -5.0F, -11.0F, 9, 9, 11, 0.0F);
        this.setRotateAngle(body, -0.012391837689159737F, 0.0F, 0.0F);
        this.rightpaw = new ModelRenderer(this, 0, 145);
        this.rightpaw.setRotationPoint(0.0F, 2.9F, -0.1F);
        this.rightpaw.addBox(-1.5F, 0.0F, -2.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(rightpaw, 0.18203784098300857F, 0.0F, 0.0F);
        this.tail2 = new ModelRenderer(this, 0, 58);
        this.tail2.setRotationPoint(0.0F, -0.6F, 8.1F);
        this.tail2.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 7, 0.0F);
        this.setRotateAngle(tail2, -0.5009094953223726F, 0.0F, 0.0F);
        this.rightarm3 = new ModelRenderer(this, 0, 137);
        this.rightarm3.setRotationPoint(0.0F, 5.3F, 0.1F);
        this.rightarm3.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(rightarm3, -0.136659280431156F, 0.0F, 0.0F);
        this.leftleg3 = new ModelRenderer(this, 19, 98);
        this.leftleg3.setRotationPoint(0.0F, 4.5F, 2.0F);
        this.leftleg3.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(leftleg3, -0.5009094953223726F, 0.0F, 0.0F);
        this.leftarm3.addChild(this.leftpaw);
        this.leftleg1.addChild(this.leftleg2);
        this.leftarm1.addChild(this.leftarm2);
        this.rightear2.addChild(this.rightear3);
        this.leftear1.addChild(this.leftear2);
        this.head.addChild(this.rightear1);
        this.rightleg1.addChild(this.rightleg2);
        this.head.addChild(this.leftear1);
        this.body.addChild(this.backhair2);
        this.body.addChild(this.rear);
        this.body.addChild(this.backhair3);
        this.rleftjoint.addChild(this.leftleg1);
        this.rear.addChild(this.tail1);
        this.rightleg2.addChild(this.rightleg3);
        this.body.addChild(this.backhair);
        this.rrightjoint.addChild(this.rightleg1);
        this.leftleg3.addChild(this.leftfoot);
        this.rightear1.addChild(this.rightear2);
        this.head.addChild(this.lowerjaw);
        this.rightarm1.addChild(this.rightarm2);
        this.frightjoint.addChild(this.rightarm1);
        this.topjaw.addChild(this.snout);
        this.leftear2.addChild(this.leftear3);
        this.fleftjoint.addChild(this.leftarm1);
        this.body.addChild(this.neck);
        this.neck.addChild(this.head);
        this.leftarm2.addChild(this.leftarm3);
        this.head.addChild(this.topjaw);
        this.rightleg3.addChild(this.rightfoot);
        this.lowerjaw.addChild(this.lowerjaw2);
        this.rightarm3.addChild(this.rightpaw);
        this.tail1.addChild(this.tail2);
        this.rightarm2.addChild(this.rightarm3);
        this.leftleg2.addChild(this.leftleg3);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.rleftjoint.render(f5);
        this.fleftjoint.render(f5);
        this.frightjoint.render(f5);
        this.rrightjoint.render(f5);
        this.body.render(f5);
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
    	this.rrightjoint.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F ) * 0.6F * limbSwingAmount;
    	this.frightjoint.rotateAngleX = MathHelper.cos(limbSwing  * 0.6662F + (float)Math.PI) * 0.6F * limbSwingAmount;

    
    	
    	this.rleftjoint.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI ) * 0.6F * limbSwingAmount;
    	this.fleftjoint.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F ) * 0.6F * limbSwingAmount;
    }
    
}
