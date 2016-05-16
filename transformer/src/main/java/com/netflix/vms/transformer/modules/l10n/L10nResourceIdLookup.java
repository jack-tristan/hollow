package com.netflix.vms.transformer.modules.l10n;

public class L10nResourceIdLookup {
    // Movie attributes
    public static String getMovieTitleID(Integer movieID) {
        return "m" + movieID + ".t";
    }

    public static String getMovieShortTitleID(Integer movieID) {
        return "m" + movieID + ".d";
    }

    public static String getMovieASCIITitleID(Integer movieID) {
        return "m" + movieID + ".a";
    }

    public static String getMovieOriginalTitleID(Integer movieID) {
        // if this changes, update ResourceLookupLogic and TestResourceLookupLogic
        return "m" + movieID + ".o";
    }

    public static String getMovieSynopsisID(Integer movieID) {
        return "m" + movieID + ".s";
    }

    public static String getMovieTVSynopsisID(Integer movieID) {
        return "m" + movieID + ".v";
    }

    public static String getMovieBRFeaturesID(Integer movieID) {
        return "m" + movieID + ".b";
    }

    public static String getMovieDDFeaturesID(Integer movieID) {
        return "m" + movieID + ".f";
    }

    // Episode attributes
    public static String getEpisodeTitleID(Integer episodeID) {
        return "e" + episodeID + ".t";
    }

    // Genre attributes
    public static String getGenreNameID(Integer genreID) {
        return "g" + genreID + ".n";
    }

    public static String getGenreDescriptionID(Integer genreID) {
        return "g" + genreID + ".d";
    }

    // Person attributes
    public static String getPersonNameID(Integer personID) {
        // if this changes, update ResourceLookupLogic and TestResourceLookupLogic
        return "p" + personID + ".n";
    }

    public static String getPersonBioID(Integer personID) {
        return "p" + personID + ".b";
    }

    // Person alias attributes
    public static String getPersonAliasID(Integer aliasID) {
        return "pa" + aliasID + ".a";
    }

    // Certification systems, certifications, movie certifications
    public static String getCertificationSystemNameID(Integer systemID) {
        return "c" + systemID + ".n";
    }

    public static String getCertificationSystemDescriptionID(Integer systemID) {
        return "c" + systemID + ".d";
    }

    public static String getCertificationNameID(Integer certificationTypeID) {
        return "r" + certificationTypeID + ".r";
    }

    public static String getCertificationDescriptionID(Integer certificationTypeID) {
        return "r" + certificationTypeID + ".d";
    }

    public static String getMovieCertificationDescriptionID(Integer movieID, Integer systemID, String media) {
        return "mr" + movieID + "_" + systemID + "_" + media + ".r";
    }

    // Film festival attributes
    public static String getFestivalNameID(Integer festivalID) {
        return "f" + festivalID + ".n";
    }

    public static String getFestivalDescriptionID(Integer festivalID) {
        return "f" + festivalID + ".d";
    }

    public static String getFestivalLocationID(Integer festivalID) {
        return "f" + festivalID + ".l";
    }

    public static String getFestivalShortNameID(Integer festivalID) {
        return "f" + festivalID + ".s";
    }

    public static String getFestivalSingularNameID(Integer festivalID) {
        return "f" + festivalID + ".u";
    }

    public static String getFestivalCopyrightID(Integer festivalID) {
        return "f" + festivalID + ".c";
    }

    // Movie award attributes
    public static String getAwardNameID(Integer awardID) {
        return "a" + awardID + ".n";
    }

    public static String getAwardDescriptionID(Integer awardID) {
        return "a" + awardID + ".d";
    }

    public static String getAwardAlternateNameID(Integer awardID) {
        return "a" + awardID + ".t";
    }

    // QT (altgenre, tags, categories) attributes
    public static String getAltGenreNameID(Integer altgenreID) {
        return "ag" + altgenreID + ".n";
    }

    public static String getAltGenreShortNameID(Integer altgenreID) {
        return "ag" + altgenreID + ".s";
    }

    public static String getAltGenreAlternateNameID(Integer altgenreID, Integer altTypeID) {
        return "ag" + altgenreID + "_" + altTypeID + ".t";
    }

    public static String getCategoryNameID(Integer categoryID) {
        return "cn" + categoryID + ".n";
    }

    public static String getCategoryGroupNameID(Integer categoryGroupID) {
        return "cg" + categoryGroupID + ".n";
    }

    // Language attributes
    public static String getLanguageNameID(Integer nfLanguageID) {
        return "l" + nfLanguageID + ".n";
    }

    // Character attributes
    public static String getCharacterNameID(Integer characterId) {
        return "ch" + characterId + ".cn";
    }

    public static String getCharacterBioID(Integer characterId) {
        return "ch" + characterId + ".b";
    }

    // Show member type attributes
    public static String getShowMemberTypeNameID(Integer memberTypeID) {
        return "st" + memberTypeID + ".n";
    }

    public static String getHookTextId(final Integer id, final HookType type) {
        return "m" + id + ".h" + "." + type.getId();
    }

    public static String getNarrativeTextId(final Integer id) {
        return "m" + id + ".n";
    }

    public static String getTrackLabelId(final String id) {
        return "s" + id + ".l";
    }

    public static String getGenericResourceId(final Integer id, final String resourceIdPrefix, final String attribName) {
        return resourceIdPrefix + id + "." + attribName;
    }

    public static String createRolloutAttribResourceId(final Integer id, final String name, final String label) {
        return String.format("rv_%d_%s_%s", id, name, label);
    }

    public static String createCharacterAttribResourceId(final Integer id, final String name, final String label) {
        return String.format("rc_%d_%s_%s", id, name, label);
    }

    public static String getRolloutAttribResourceId(final Integer id, final String name, final String label) {
        return createRolloutAttribResourceId(id, name, label);
    }

    public static String getCharacterAttribResourceId(final Integer id, final String name, final String label) {
        return createCharacterAttribResourceId(id, name, label);
    }

    public static String getMovieAkaTitleResourceID(Integer id) {
        return "m" + id + ".ak";
    }

    public static String getMovieTransliteratedTitleResourceID(Integer id) {
        return "m" + id + ".tl";
    }

    public static String getPersonAkaNameResourceID(Integer id) {
        return "p" + id + ".ak";
    }

    public static String getPersonTransliteratedNameResourceID(Integer id) {
        return "p" + id + ".tl";
    }
}