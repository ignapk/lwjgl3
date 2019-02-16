/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Structure describing depth/stencil resolve properties that can be supported by an implementation.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRDepthStencilResolve#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES_KHR}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code supportedDepthResolveModes} &ndash; a bitmask of {@code VkResolveModeFlagBitsKHR} indicating the set of supported depth resolve modes. {@link KHRDepthStencilResolve#VK_RESOLVE_MODE_SAMPLE_ZERO_BIT_KHR RESOLVE_MODE_SAMPLE_ZERO_BIT_KHR} <b>must</b> be included in the set but implementations <b>may</b> support additional modes.</li>
 * <li>{@code supportedStencilResolveModes} &ndash; a bitmask of {@code VkResolveModeFlagBitsKHR} indicating the set of supported stencil resolve modes. {@link KHRDepthStencilResolve#VK_RESOLVE_MODE_SAMPLE_ZERO_BIT_KHR RESOLVE_MODE_SAMPLE_ZERO_BIT_KHR} <b>must</b> be included in the set but implementations <b>may</b> support additional modes. {@link KHRDepthStencilResolve#VK_RESOLVE_MODE_AVERAGE_BIT_KHR RESOLVE_MODE_AVERAGE_BIT_KHR} <b>must</b> not be included in the set.</li>
 * <li>{@code independentResolveNone} &ndash; {@link VK10#VK_TRUE TRUE} if the implementation supports setting the depth and stencil resolve modes to different values when one of those modes is {@link KHRDepthStencilResolve#VK_RESOLVE_MODE_NONE_KHR RESOLVE_MODE_NONE_KHR}. Otherwise the implementation only supports setting both modes to the same value.</li>
 * <li>{@code independentResolve} &ndash; {@link VK10#VK_TRUE TRUE} if the implementation supports all combinations of the supported depth and stencil resolve modes.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDepthStencilResolvePropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkResolveModeFlagsKHR supportedDepthResolveModes;
 *     VkResolveModeFlagsKHR supportedStencilResolveModes;
 *     VkBool32 independentResolveNone;
 *     VkBool32 independentResolve;
 * }</code></pre>
 */
public class VkPhysicalDeviceDepthStencilResolvePropertiesKHR extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUPPORTEDDEPTHRESOLVEMODES,
        SUPPORTEDSTENCILRESOLVEMODES,
        INDEPENDENTRESOLVENONE,
        INDEPENDENTRESOLVE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUPPORTEDDEPTHRESOLVEMODES = layout.offsetof(2);
        SUPPORTEDSTENCILRESOLVEMODES = layout.offsetof(3);
        INDEPENDENTRESOLVENONE = layout.offsetof(4);
        INDEPENDENTRESOLVE = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDepthStencilResolvePropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDepthStencilResolvePropertiesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code supportedDepthResolveModes} field. */
    @NativeType("VkResolveModeFlagsKHR")
    public int supportedDepthResolveModes() { return nsupportedDepthResolveModes(address()); }
    /** Returns the value of the {@code supportedStencilResolveModes} field. */
    @NativeType("VkResolveModeFlagsKHR")
    public int supportedStencilResolveModes() { return nsupportedStencilResolveModes(address()); }
    /** Returns the value of the {@code independentResolveNone} field. */
    @NativeType("VkBool32")
    public boolean independentResolveNone() { return nindependentResolveNone(address()) != 0; }
    /** Returns the value of the {@code independentResolve} field. */
    @NativeType("VkBool32")
    public boolean independentResolve() { return nindependentResolve(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDepthStencilResolvePropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDepthStencilResolvePropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDepthStencilResolvePropertiesKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDepthStencilResolvePropertiesKHR set(VkPhysicalDeviceDepthStencilResolvePropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDepthStencilResolvePropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceDepthStencilResolvePropertiesKHR create(long address) {
        return wrap(VkPhysicalDeviceDepthStencilResolvePropertiesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDepthStencilResolvePropertiesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceDepthStencilResolvePropertiesKHR.class, address);
    }

    /**
     * Create a {@link VkPhysicalDeviceDepthStencilResolvePropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthStencilResolvePropertiesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDepthStencilResolvePropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDepthStencilResolvePropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDepthStencilResolvePropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #supportedDepthResolveModes}. */
    public static int nsupportedDepthResolveModes(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDepthStencilResolvePropertiesKHR.SUPPORTEDDEPTHRESOLVEMODES); }
    /** Unsafe version of {@link #supportedStencilResolveModes}. */
    public static int nsupportedStencilResolveModes(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDepthStencilResolvePropertiesKHR.SUPPORTEDSTENCILRESOLVEMODES); }
    /** Unsafe version of {@link #independentResolveNone}. */
    public static int nindependentResolveNone(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDepthStencilResolvePropertiesKHR.INDEPENDENTRESOLVENONE); }
    /** Unsafe version of {@link #independentResolve}. */
    public static int nindependentResolve(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDepthStencilResolvePropertiesKHR.INDEPENDENTRESOLVE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDepthStencilResolvePropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDepthStencilResolvePropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDepthStencilResolvePropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDepthStencilResolvePropertiesKHR, Buffer> {

        private static final VkPhysicalDeviceDepthStencilResolvePropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceDepthStencilResolvePropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDepthStencilResolvePropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDepthStencilResolvePropertiesKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkPhysicalDeviceDepthStencilResolvePropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDepthStencilResolvePropertiesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDepthStencilResolvePropertiesKHR.npNext(address()); }
        /** Returns the value of the {@code supportedDepthResolveModes} field. */
        @NativeType("VkResolveModeFlagsKHR")
        public int supportedDepthResolveModes() { return VkPhysicalDeviceDepthStencilResolvePropertiesKHR.nsupportedDepthResolveModes(address()); }
        /** Returns the value of the {@code supportedStencilResolveModes} field. */
        @NativeType("VkResolveModeFlagsKHR")
        public int supportedStencilResolveModes() { return VkPhysicalDeviceDepthStencilResolvePropertiesKHR.nsupportedStencilResolveModes(address()); }
        /** Returns the value of the {@code independentResolveNone} field. */
        @NativeType("VkBool32")
        public boolean independentResolveNone() { return VkPhysicalDeviceDepthStencilResolvePropertiesKHR.nindependentResolveNone(address()) != 0; }
        /** Returns the value of the {@code independentResolve} field. */
        @NativeType("VkBool32")
        public boolean independentResolve() { return VkPhysicalDeviceDepthStencilResolvePropertiesKHR.nindependentResolve(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDepthStencilResolvePropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDepthStencilResolvePropertiesKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDepthStencilResolvePropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDepthStencilResolvePropertiesKHR.npNext(address(), value); return this; }

    }

}