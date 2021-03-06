package arknights.registry;

import arknights.renderer.entity.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RendererHandler {
    @SubscribeEvent
    public static void register(){
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.ORIGINIUMSLUG, OriginiumSlugRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.CROWNSLAYER, CrownslayerRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.FAUST, FaustRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.EnemyW, WRenderer::new);
        //RenderingRegistry.registerEntityRenderingHandler(EntityHandler.MONSTERUAV, MonsterUAVRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.BULLET, BulletRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.AMIYAMAGIC, AmiyaMagicRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.DISASTERZERO, DisasterRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.SNOWSTORM, DisasterRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.EXUSIAI, ExusiaiRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.AMIYA, AmiyaRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.PROJEKTRED, ProjektRedRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.SHAW, ShawRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.ROPE, RopeRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.ANSEL, AnselRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.HOOK, HookRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.ANSELHEALPACK, renderManager -> new SpriteRenderer<>(renderManager, Minecraft.getInstance().getItemRenderer()));
    }
}
