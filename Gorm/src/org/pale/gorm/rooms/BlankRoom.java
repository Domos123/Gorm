package org.pale.gorm.rooms;

import org.pale.gorm.Building;
import org.pale.gorm.Extent;
import org.pale.gorm.MaterialManager;
import org.pale.gorm.Room;

/**
 * A plain, carpeted room.
 * @author white
 *
 */
public class BlankRoom extends Room {

	public BlankRoom(MaterialManager mgr,Extent e, Building b) {
		super(mgr, e, b);
	}

	@Override
	public Extent build(MaterialManager mgr, Extent buildingExtent) {
		addSignHack();
		return null; // we don't modify the building extent
	}

}
