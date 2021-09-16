package ru.tpu.hiearhia.Sony;

import ru.tpu.hiearhia.AppliancesFactory;
import ru.tpu.hiearhia.Kettle;
import ru.tpu.hiearhia.Vacuum;
import ru.tpu.hiearhia.Washing;

public class SonyAppliancesFactory implements AppliancesFactory {
    @Override
    public Kettle addKet() {
        return new SonyKet();
    }

    @Override
    public Vacuum addVac() {
        return new SonyVac();
    }

    @Override
    public Washing addWash() {
        return new SonyWash();
    }
}
