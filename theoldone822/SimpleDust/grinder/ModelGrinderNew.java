package theoldone822.SimpleDust.grinder;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGrinderNew extends ModelBase
{
    // fields
    ModelRenderer base;
    ModelRenderer wallleft;
    ModelRenderer wallright;
    ModelRenderer frontgrinder1;
    ModelRenderer frontgrinder2;
    ModelRenderer middlegrinder1;
    ModelRenderer middlegrinder2;
    ModelRenderer backgrinder1;
    ModelRenderer backgrinder2;
    ModelRenderer topbase;
    ModelRenderer toptop;

    public ModelGrinderNew()
    {
        textureWidth = 128;
        textureHeight = 64;

        base = new ModelRenderer(this, 0, 44);
        base.addBox(-8F, -8F, -8F, 16, 4, 16);
        base.setRotationPoint(0F, 28F, 0F);
        base.setTextureSize(128, 64);
        base.mirror = true;
        setRotation(base, 0F, 0F, 0F);
        wallleft = new ModelRenderer(this, 0, 20);
        wallleft.addBox(0F, 0F, 0F, 1, 8, 16);
        wallleft.setRotationPoint(7F, 12F, -8F);
        wallleft.setTextureSize(128, 64);
        wallleft.mirror = true;
        setRotation(wallleft, 0F, 0F, 0F);
        wallright = new ModelRenderer(this, 0, 20);
        wallright.addBox(0F, 0F, 0F, 1, 8, 16);
        wallright.setRotationPoint(-8F, 12F, -8F);
        wallright.setTextureSize(128, 64);
        wallright.mirror = true;
        setRotation(wallright, 0F, 0F, 0F);
        frontgrinder1 = new ModelRenderer(this, 66, 0);
        frontgrinder1.addBox(-8F, -2F, -2F, 14, 4, 4);
        frontgrinder1.setRotationPoint(1F, 16F, -6F);
        frontgrinder1.setTextureSize(128, 64);
        frontgrinder1.mirror = true;
        setRotation(frontgrinder1, 0.7853982F, 0F, 0F);
        frontgrinder2 = new ModelRenderer(this, 66, 0);
        frontgrinder2.addBox(-8F, -2F, -2F, 14, 4, 4);
        frontgrinder2.setRotationPoint(1F, 16F, -6F);
        frontgrinder2.setTextureSize(128, 64);
        frontgrinder2.mirror = true;
        setRotation(frontgrinder2, 0F, 0F, 0F);
        middlegrinder1 = new ModelRenderer(this, 66, 0);
        middlegrinder1.addBox(-8F, -2F, -2F, 14, 4, 4);
        middlegrinder1.setRotationPoint(1F, 16F, 0F);
        middlegrinder1.setTextureSize(128, 64);
        middlegrinder1.mirror = true;
        setRotation(middlegrinder1, 0F, 0F, 0F);
        middlegrinder2 = new ModelRenderer(this, 66, 0);
        middlegrinder2.addBox(-8F, -2F, -2F, 14, 4, 4);
        middlegrinder2.setRotationPoint(1F, 16F, 0F);
        middlegrinder2.setTextureSize(128, 64);
        middlegrinder2.mirror = true;
        setRotation(middlegrinder2, 0.7853982F, 0F, 0F);
        backgrinder1 = new ModelRenderer(this, 66, 0);
        backgrinder1.addBox(-8F, -2F, -2F, 14, 4, 4);
        backgrinder1.setRotationPoint(1F, 16F, 6F);
        backgrinder1.setTextureSize(128, 64);
        backgrinder1.mirror = true;
        setRotation(backgrinder1, 0F, 0F, 0F);
        backgrinder2 = new ModelRenderer(this, 66, 0);
        backgrinder2.addBox(-8F, -2F, -2F, 14, 4, 4);
        backgrinder2.setRotationPoint(1F, 16F, 6F);
        backgrinder2.setTextureSize(128, 64);
        backgrinder2.mirror = true;
        setRotation(backgrinder2, 0.7853982F, 0F, 0F);
        topbase = new ModelRenderer(this, 0, 0);
        topbase.addBox(-8F, -2F, -8F, 16, 2, 16);
        topbase.setRotationPoint(0F, 12F, 0F);
        topbase.setTextureSize(128, 64);
        topbase.mirror = true;
        setRotation(topbase, 0F, 0F, 0F);
        toptop = new ModelRenderer(this, 36, 20);
        toptop.addBox(-6F, -1F, -6F, 12, 2, 12);
        toptop.setRotationPoint(0F, 9F, 0F);
        toptop.setTextureSize(128, 64);
        toptop.mirror = true;
        setRotation(toptop, 0F, 0F, 0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        base.render(f5);
        wallleft.render(f5);
        wallright.render(f5);
        frontgrinder1.render(f5);
        frontgrinder2.render(f5);
        middlegrinder1.render(f5);
        middlegrinder2.render(f5);
        backgrinder1.render(f5);
        backgrinder2.render(f5);
        topbase.render(f5);
        toptop.render(f5);
    }

    public void renderAll()
    {
        final float f5 = 1 / 16f;
        base.render(f5);
        wallleft.render(f5);
        wallright.render(f5);
        frontgrinder1.render(f5);
        frontgrinder2.render(f5);
        middlegrinder1.render(f5);
        middlegrinder2.render(f5);
        backgrinder1.render(f5);
        backgrinder2.render(f5);
        topbase.render(f5);
        toptop.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity par7Entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, par7Entity);
    }

    public void spin(float amount)
    {
        frontgrinder1.rotateAngleX = amount;
        frontgrinder2.rotateAngleX = amount + 0.75f;
        middlegrinder1.rotateAngleX = -amount;
        middlegrinder2.rotateAngleX = -amount + 0.75f;
        backgrinder1.rotateAngleX = amount;
        backgrinder2.rotateAngleX = amount + 0.75f;
    }
}
