package com.bgsoftware.superiorskyblock.config;

@SuppressWarnings("unused")
public final class ConfigComments {

    @Comment("######################################################")
    @Comment("##                                                  ##")
    @Comment("##                SuperiorSkyblock 2                ##")
    @Comment("##                Developed by Ome_R                ##")
    @Comment("##                                                  ##")
    @Comment("######################################################")
    public static String HEADER = "";

    @Comment("")
    @Comment("Here you can set the amount of time between auto saves.")
    @Comment("If you want to disable this feature, set interval to 0")
    @Comment("Disabling auto save is not recommended, as it's done async.")
    public static String SAVE_INTERVAL = "save-interval";

    @Comment("")
    @Comment("Here you can set the amount of time between auto calculations of all islands.")
    @Comment("If you want to disable this feature, set interval to 0")
    @Comment("It's recommended to set the task to a high interval, as it might cause lag.")
    public static String CALC_INTERVAL = "calc-interval";

    @Comment("")
    @Comment("Set the maximum island size. Island distances is 3 times bigger than the max size.")
    @Comment("Please, do not change it while you have a running islands world!")
    public static String MAX_ISLAND_SIZE = "max-island-size";

    @Comment("")
    @Comment("The default island size of all islands.")
    @Comment("This island size can be expanded by using the /is admin setsize command.")
    public static String DEFAULT_ISLAND_SIZE = "default-island-size";

    @Comment("")
    @Comment("Set the default hoppers limit of islands.")
    @Comment("This limit can be expanded by using the /is admin sethopperslimit command.")
    public static String DEFAULT_HOPPERS_LIMIT = "default-hoppers-limit";

    @Comment("")
    @Comment("The amount of warps an island can have")
    @Comment("This limit can be expanded by using the /is admin setwarpslimit command.")
    public static String DEFAULT_WARPS_LIMIT = "default-warps-limit";

    @Comment("")
    @Comment("Set the default team limit of islands.")
    @Comment("This limit can be expanded by using the /is admin setteamlimit command.")
    public static String DEFAULT_TEAM_LIMIT = "default-team-limit";

    @Comment("")
    @Comment("Set the default crop-growth multiplier of islands.")
    @Comment("This multiplier can be expanded by using the /is admin setcropgrowth command.")
    public static String DEFAULT_CROP_GROWTH = "default-crop-growth";

    @Comment("")
    @Comment("Set the default spawner-rates multiplier of islands.")
    @Comment("This multiplier can be expanded by using the /is admin setspawnerrates command.")
    public static String DEFAULT_SPAWNER_RATES = "default-spawner-rates";

    @Comment("")
    @Comment("Set the default mob-drops multiplier of islands.")
    @Comment("This multiplier can be expanded by using the /is admin setmobdrops command.")
    public static String DEFAULT_MOB_DROPS = "default-mob-drops";

    @Comment("")
    @Comment("Feature that adds per player world border in islands.")
    @Comment("If you want to globally disable it, set this section to false.")
    @Comment("World borders can be toggled by using the /is toggle border command.")
    public static String WORLD_BORDERS = "world-borders";

    @Comment("")
    @Comment("All settings related to stacked blocks.")
    public static String STACKED_BLOCKS = "stacked-blocks";

    @Comment("If you want to globally disable stacked blocks, set this section to false.")
    @Comment("Placement of stacked blocks can be toggled by using the /is toggle blocks command.")
    public static String STACKED_BLOCKS_ENABLED = "stacked-blocks.enabled";

    @Comment("")
    @Comment("Custom name for the blocks.")
    public static String STACKED_BLOCKS_CUSTOM_NAME = "stacked-blocks.custom-name";

    @Comment("")
    @Comment("A list of whitelisted blocks that will get stacked when players have stack mode toggled on.")
    public static String STACKED_BLOCKS_WHITELISTED = "stacked-blocks.whitelisted";

    @Comment("")
    @Comment("Set a formula to calculate the island level by it's worth.")
    @Comment("Use {} as a placeholder for worth. Make sure you only use digits and mathematical operations!")
    public static String ISLAND_LEVEL_FORMULA = "island-level-formula";

    @Comment("")
    @Comment("How should the island top be ordered by?")
    @Comment("Set 'WORTH' if you want it to be ordered by island worth, or 'LEVEL' if you want it to be ordered by island levels.")
    public static String ISLAND_TOP_ORDER = "island-top-order";

    @Comment("")
    @Comment("Set a set of default permissions for each role to be added to new islands.")
    @Comment("Players can edit these permissions using the /is setpermission command.")
    public static String DEFAULT_PERMISSIONS = "default-permissions";

    @Comment("A list of default permissions for guests.")
    public static String DEFAULT_PERMISSIONS_GUEST = "default-permissions.guest";

    @Comment("")
    @Comment("A list of default permissions for members.")
    @Comment("Members have all permissions of guests!")
    public static String DEFAULT_PERMISSIONS_MEMBER = "default-permissions.member";

    @Comment("")
    @Comment("A list of default permissions for moderators.")
    @Comment("Moderators have all permissions of members!")
    public static String DEFAULT_PERMISSIONS_MOD = "default-permissions.mod";

    @Comment("")
    @Comment("A list of default permissions for admins.")
    @Comment("Admins have all permissions of moderators!")
    public static String DEFAULT_PERMISSIONS_ADMIN = "default-permissions.admin";

    @Comment("")
    @Comment("A list of default permissions for leaders.")
    @Comment("Leaders have all permissions of admins!")
    @Comment("Note: Permissions of leaders cannot be changed!")
    public static String DEFAULT_PERMISSIONS_LEADER = "default-permissions.leader";

    @Comment("")
    @Comment("Set the line to create the warp sign.")
    public static String SIGN_WARP_LINE = "sign-warp-line";

    @Comment("")
    @Comment("Set the lines of the island warp.")
    public static String SIGN_WARP = "sign-warp";

    @Comment("")
    @Comment("Set the divider for the island bank money in the total island worth.")
    @Comment("You can set it to 0 to disable island bank money to be calculated in island worth.")
    public static String BANK_WORTH_RATE = "bank-worth-rate";

    @Comment("")
    @Comment("Set the name of the islands world.")
    public static String ISLAND_WORLD = "island-world";

    @Comment("")
    @Comment("Set the location of the spawn of the server.")
    @Comment("Make sure you follow the format: <world>, <x>, <y>, <z>")
    public static String SPAWN_LOCATION = "spawn-location";

    @Comment("")
    @Comment("When enabled, the islands protection will be on the spawn too.")
    @Comment("If disabled, it's your responsibility to protect the spawn!")
    public static String SPAWN_PROTECTION = "spawn-protection";

    @Comment("")
    @Comment("When enabled, pvp will be enabled in the spawn.")
    @Comment("Can be disabled using other plugins.")
    public static String SPAWN_PVP = "spawn-pvp";

    @Comment("")
    @Comment("When enabled, players will get teleported upon void fall.")
    @Comment("If they fall not in an island, they will be teleported to spawn.")
    public static String VOID_TELEPORT = "void-teleport";

    @Comment("")
    @Comment("A list of interactable blocks.")
    @Comment("Only interactable blocks & stacked blocks will be blocked from being interacted.")
    public static String INTERACTABLES = "interactables";

    @Comment("")
    @Comment("When disabled, visitors won't get damaged in other islands.")
    public static String VISITORS_DAMAGE = "visitors-damage";

    @Comment("")
    @Comment("The amount of times a player can disband an island.")
    @Comment("If you want to disable this feature, set it to 0.")
    public static String DISBAND_COUNT = "disband-count";

    @Comment("")
    @Comment("Should the list of members in island top also include the island leader?")
    public static String ISLAND_TOP_INCLUDE_LEADER = "island-top-include-leader";

    @Comment("")
    @Comment("Set default placeholders that will be returned if the island is null.")
    @Comment("Please use the <placeholder>:<default> format.")
    public static String DEFAULT_PLACEHOLDERS = "default-placeholders";

    @Comment("")
    @Comment("Should a confirm gui be displayed when /is disband is executed.")
    public static String DISBAND_CONFIRM = "disband-confirm";

    @Comment("")
    @Comment("If you want a specific spawners provider to use, specify it here.")
    @Comment("Providers: Auto, MergedSpawner, StackSpawners, WildStacker, SilkSpawners, PvpingSpawners")
    public static String SPAWNERS_PROVIDER = "spawners-provider";

    @Comment("")
    @Comment("Should inventories of island members get cleared after disbanding their island?")
    public static String DISBAND_INVENTORY_CLEAR = "disband-inventory-clear";

    @Comment("")
    @Comment("All settings related to island names.")
    public static String ISLAND_NAMES = "island-names";

    @Comment("Should creation of islands will ask for name (/is create <name>)?")
    public static String ISLAND_NAMES_REQUIRED_FOR_CREATION = "island-names.required-for-creation";

    @Comment("")
    @Comment("The maximum length for names.")
    public static String ISLAND_NAMES_MAX_LENGTH = "island-names.max-length";

    @Comment("")
    @Comment("The minimum length for names.")
    public static String ISLAND_NAMES_MIN_LENGTH = "island-names.min-length";

    @Comment("")
    @Comment("A list of names that will be blacklisted.")
    public static String ISLAND_NAMES_FILTERED_NAMES = "island-names.filtered-names";

    @Comment("")
    @Comment("Should names have color support enabled?")
    public static String ISLAND_NAMES_COLOR_SUPPORT = "island-names.color-support";

    @Comment("")
    @Comment("Should names be displayed on island-top?")
    public static String ISLAND_NAMES_ISLAND_TOP = "island-names.island-top";

    @Comment("")
    @Comment("Should players get teleported to the island after they accept an invite?")
    public static String TELEPORT_ON_JOIN = "teleport-on-join";

    @Comment("")
    @Comment("Should the inventory of the players get cleared after they accept an invite?")
    public static String CLEAR_ON_JOIN = "clear-on-join";

}
