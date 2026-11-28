Creating object
WaterFixture fixtureName = new ShowerFixture(name, waterFlowRate);
WaterFixture fixtureName = new ToiletFixture(name, waterUsagePerFlush);
WaterFixture fixtureName = new ApplianceFixture(name, waterFlowRate);

Common method
fixtureName.getWaterUsage(), return water usage
fixtureName.getName(), return fixture name
fixtureName.calculateWaterUsage(double amount), return the water usage by multiplying the WFR or WUPF by amount
fixtureName.requireWholeNumber(), return whether this fixture requires whole number (toilet requires whole number (number of flushes), appliance and shower don't require whole number)
fixtureName.savingTips(), return the corresponding saving tip for this fixture