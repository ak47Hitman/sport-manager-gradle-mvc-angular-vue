package object;

/**
 * Simple POJO Player for JSON marshaling
 * 
 * @author aka47
 * @version 1.0
 */
public class Player {
	private final long		id;
	private final String	name;

	public Player(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * Player id
	 * 
	 * @return id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Player name
	 * 
	 * @return name
	 */
	public String getName() {
		return this.name;
	}
}