package io.lindstrom.m3u8.parser;

import io.lindstrom.m3u8.model.MediaPlaylist;

public interface TagsSupport {
    public static final TagsSupport IGNORE_NON_STANDARD_TAGS = new TagsSupport() {
        @Override
        public boolean supports(String prefix) {
            return true;
        }

        @Override
        public void process(String prefix, String attributes, MediaPlaylistBuilder builder) {
            //NOOP
        }
    };

    boolean supports(String prefix);

    void process(String prefix, String attributes, MediaPlaylistBuilder builder) throws PlaylistParserException;
}
