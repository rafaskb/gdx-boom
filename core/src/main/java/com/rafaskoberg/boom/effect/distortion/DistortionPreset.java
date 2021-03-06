package com.rafaskoberg.boom.effect.distortion;

public enum DistortionPreset {

    // ===========================
    // ===   Default Presets   ===
    // ===========================
    GENERIC(new DistortionData(0.5f, 0.5f, 8000f, 3600f, 3600f)),
    SOFT(new DistortionData(0.1f, 0.5f, 8000f, 3600f, 3600f)),
    CRUSHER(new DistortionData(1.0f, 1.0f, 8000f, 3600f, 3600f)),
    ;

    // Internal

    private final DistortionData data;

    DistortionPreset(DistortionData data) {
        this.data = data;
    }

    public DistortionData getData() {
        return data;
    }

}
