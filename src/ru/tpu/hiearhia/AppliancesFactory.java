package ru.tpu.hiearhia;

import ru.tpu.hiearhia.Kettle;
import ru.tpu.hiearhia.Vacuum;
import ru.tpu.hiearhia.Washing;

public interface   AppliancesFactory {
    public abstract Kettle addKet();
    public abstract Vacuum addVac();
    public abstract Washing addWash();
}
