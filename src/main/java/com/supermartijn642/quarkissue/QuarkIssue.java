package com.supermartijn642.quarkissue;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.IChunk;
import net.minecraftforge.event.world.ChunkEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Created 1/22/2021 by SuperMartijn642
 */
@Mod("quarkissue")
public class QuarkIssue {

    public QuarkIssue(){
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class Events {
        @SubscribeEvent
        public static void onChunkLoad(ChunkEvent.Load e){
            IChunk chunk = e.getChunk();

            for(BlockPos pos : chunk.getTileEntitiesPos())
                chunk.getTileEntity(pos);
        }
    }

}
