/** Represents a Formula One driver from any point in time. A driver is identified by their
 * name, driver number, or on-screen name abbreviation.
 */
public class Driver {
  // The driver's name as shown on F1TV
  private String tvName;
  // Code that uniquely identifies the driver's country
  private String countryCode;
  // Driver's unique identifying number
  private int driverNumber;
  // Driver's first name
  private String firstName;
  // Driver's full name
  private String fullName;
  // URL of the driver's face photo
  private String headshotURL;
  // The unique identifier for the meeting (Grand Prix or testing weekend)
  // Use latest to identify the latest or current meeting.
  private int meetingKey;
  // Three-letter acronym of the driver's name.
  private String nameAcronym;
  // The unique identifier for the session.
  // Use latest to identify the latest or current session.
  private int sessionKey;
  // The hexadecimal color value (RRGGBB) of the driver's team.
  private String teamColor;
  // Name of the driver's team.
  private String teamName;
}
