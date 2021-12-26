package io.github.projectet.ae2things.block.entity;

import io.github.projectet.ae2things.AE2Things;
import io.github.projectet.ae2things.inventory.ThingInventory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class BEAdvancedInscriber extends BlockEntity implements ThingInventory, SidedInventory {

    private DefaultedList<ItemStack> inventory = DefaultedList.ofSize(10);

    public BEAdvancedInscriber(BlockPos pos, BlockState state) {
        super(AE2Things.ADVANCED_INSCRIBER_BE, pos, state);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    public int[] getAvailableSlots(Direction side) {
        return new int[0];
    }

    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction dir) {
        return false;
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction dir) {
        return false;
    }

    public static void tick(World world, BlockPos pos, BlockState state, BlockEntity blockEntity) {

    }
}