package com.vladsch.flexmark.html2md.converter;

import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.MutableDataHolder;
import com.vladsch.flexmark.util.data.MutableDataSetter;
import com.vladsch.flexmark.util.format.TableFormatOptions;
import com.vladsch.flexmark.util.html.CellAlignment;
import com.vladsch.flexmark.util.misc.Utils;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.function.BiFunction;
import java.util.regex.Pattern;

@SuppressWarnings({ "WeakerAccess" })
public class HtmlConverterOptions implements MutableDataSetter {
    public boolean listContentIndent;
    public boolean setextHeadings;
    public boolean outputUnknownTags;
    public boolean typographicQuotes;
    public boolean typographicSmarts;
    public boolean outputAttributesIdAttr;
    public boolean wrapAutoLinks;
    public boolean extractAutoLinks;
    public boolean renderComments;
    public boolean dotOnlyNumericLists;
    public boolean commentOriginalNonNumericListItem;
    public boolean preCodePreserveEmphasis;
    public boolean listsEndOnDoubleBlank;
    public boolean divAsParagraph;
    public boolean brAsParaBreaks;
    public boolean brAsExtraBlankLines;
    public boolean ignoreTableHeadingAfterRows;
    public boolean addTrailingEol;
    public boolean skipHeading1;
    public boolean skipHeading2;
    public boolean skipHeading3;
    public boolean skipHeading4;
    public boolean skipHeading5;
    public boolean skipHeading6;
    public boolean skipAttributes;
    public boolean skipFencedCode;
    public boolean skipCharEscape;
    public boolean divTableProcessing;
    public ExtensionConversion extInlineStrong;
    public ExtensionConversion extInlineEmphasis;
    public ExtensionConversion extInlineCode;
    public ExtensionConversion extInlineDel;
    public ExtensionConversion extInlineIns;
    public ExtensionConversion extInlineSub;
    public ExtensionConversion extInlineSup;
    public ExtensionConversion extMath;
    public LinkConversion extInlineLink;
    public LinkConversion extInlineImage;
    public char orderedListDelimiter;
    public char unorderedListDelimiter;
    public int definitionMarkerSpaces;
    public int minSetextHeadingMarkerLength;
    public int listItemIndent;
    public String codeIndent;
    public String eolInTitleAttribute;
    public String nbspText;
    public String thematicBreak;
    public String outputAttributesNamesRegex;
    public BiFunction<String, Integer, String> uniqueLinkRefIdGenerator;
    public Pattern outputAttributesNamesRegexPattern;
    public String outputIdAttributeRegex;
    public Pattern outputIdAttributeRegexPattern;
    public Map<Object, CellAlignment> tableCellAlignmentMap;
    public TableFormatOptions tableOptions;
    public int formatFlags;
    public int maxBlankLines;
    public int maxTrailingBlankLines;
    public String[] unwrappedTags;
    public String[] wrappedTags;
    public String[] divTableRowClasses;
    public String[] divTableCellClasses;
    public String[] divTableHdrClasses;

    public HtmlConverterOptions() {
        this((DataHolder) null);
    }

    public HtmlConverterOptions(HtmlConverterOptions other) {
        listContentIndent = other.listContentIndent;
        setextHeadings = other.setextHeadings;
        outputUnknownTags = other.outputUnknownTags;
        typographicQuotes = other.typographicQuotes;
        typographicSmarts = other.typographicSmarts;
        outputAttributesIdAttr = other.outputAttributesIdAttr;
        wrapAutoLinks = other.wrapAutoLinks;
        extractAutoLinks = other.extractAutoLinks;
        renderComments = other.renderComments;
        dotOnlyNumericLists = other.dotOnlyNumericLists;
        commentOriginalNonNumericListItem = other.commentOriginalNonNumericListItem;
        preCodePreserveEmphasis = other.preCodePreserveEmphasis;
        listsEndOnDoubleBlank = other.listsEndOnDoubleBlank;
        divAsParagraph = other.divAsParagraph;
        brAsParaBreaks = other.brAsParaBreaks;
        brAsExtraBlankLines = other.brAsExtraBlankLines;
        ignoreTableHeadingAfterRows = other.ignoreTableHeadingAfterRows;
        addTrailingEol = other.addTrailingEol;
        skipHeading1 = other.skipHeading1;
        skipHeading2 = other.skipHeading2;
        skipHeading3 = other.skipHeading3;
        skipHeading4 = other.skipHeading4;
        skipHeading5 = other.skipHeading5;
        skipHeading6 = other.skipHeading6;
        skipAttributes = other.skipAttributes;
        skipFencedCode = other.skipFencedCode;
        skipCharEscape = other.skipCharEscape;
        divTableProcessing = other.divTableProcessing;
        extInlineStrong = other.extInlineStrong;
        extInlineEmphasis = other.extInlineEmphasis;
        extInlineCode = other.extInlineCode;
        extInlineDel = other.extInlineDel;
        extInlineIns = other.extInlineIns;
        extInlineSub = other.extInlineSub;
        extInlineSup = other.extInlineSup;
        orderedListDelimiter = other.orderedListDelimiter;
        unorderedListDelimiter = other.unorderedListDelimiter;
        definitionMarkerSpaces = other.definitionMarkerSpaces;
        minSetextHeadingMarkerLength = other.minSetextHeadingMarkerLength;
        listItemIndent = other.listItemIndent;
        codeIndent = other.codeIndent;
        eolInTitleAttribute = other.eolInTitleAttribute;
        nbspText = other.nbspText;
        thematicBreak = other.thematicBreak;
        outputAttributesNamesRegex = other.outputAttributesNamesRegex;
        uniqueLinkRefIdGenerator = other.uniqueLinkRefIdGenerator;
        outputAttributesNamesRegexPattern = other.outputAttributesNamesRegexPattern;
        tableCellAlignmentMap = other.tableCellAlignmentMap;
        tableOptions = other.tableOptions;
        outputIdAttributeRegex = other.outputIdAttributeRegex;
        outputIdAttributeRegexPattern = other.outputIdAttributeRegexPattern;
        extMath = other.extMath;
        extInlineLink = other.extInlineLink;
        extInlineImage = other.extInlineImage;
        formatFlags = other.formatFlags;
        maxBlankLines = other.maxBlankLines;
        maxTrailingBlankLines = other.maxTrailingBlankLines;
        unwrappedTags = other.unwrappedTags;
        wrappedTags = other.wrappedTags;
        divTableRowClasses = other.divTableRowClasses;
        divTableCellClasses = other.divTableCellClasses;
        divTableHdrClasses = other.divTableHdrClasses;
    }

    public HtmlConverterOptions(DataHolder options) {
        listContentIndent = FlexmarkHtmlConverter.LIST_CONTENT_INDENT.get(options);
        setextHeadings = FlexmarkHtmlConverter.SETEXT_HEADINGS.get(options);
        outputUnknownTags = FlexmarkHtmlConverter.OUTPUT_UNKNOWN_TAGS.get(options);
        typographicQuotes = FlexmarkHtmlConverter.TYPOGRAPHIC_QUOTES.get(options);
        typographicSmarts = FlexmarkHtmlConverter.TYPOGRAPHIC_SMARTS.get(options);
        outputAttributesIdAttr = FlexmarkHtmlConverter.OUTPUT_ATTRIBUTES_ID.get(options);
        wrapAutoLinks = FlexmarkHtmlConverter.WRAP_AUTO_LINKS.get(options);
        extractAutoLinks = FlexmarkHtmlConverter.EXTRACT_AUTO_LINKS.get(options);
        renderComments = FlexmarkHtmlConverter.RENDER_COMMENTS.get(options);
        dotOnlyNumericLists = FlexmarkHtmlConverter.DOT_ONLY_NUMERIC_LISTS.get(options);
        commentOriginalNonNumericListItem = FlexmarkHtmlConverter.COMMENT_ORIGINAL_NON_NUMERIC_LIST_ITEM.get(options);
        preCodePreserveEmphasis = FlexmarkHtmlConverter.PRE_CODE_PRESERVE_EMPHASIS.get(options);
        listsEndOnDoubleBlank = FlexmarkHtmlConverter.LISTS_END_ON_DOUBLE_BLANK.get(options);
        divAsParagraph = FlexmarkHtmlConverter.DIV_AS_PARAGRAPH.get(options);
        brAsParaBreaks = FlexmarkHtmlConverter.BR_AS_PARA_BREAKS.get(options);
        brAsExtraBlankLines = FlexmarkHtmlConverter.BR_AS_EXTRA_BLANK_LINES.get(options);
        ignoreTableHeadingAfterRows = FlexmarkHtmlConverter.IGNORE_TABLE_HEADING_AFTER_ROWS.get(options);
        addTrailingEol = FlexmarkHtmlConverter.ADD_TRAILING_EOL.get(options);
        skipHeading1 = FlexmarkHtmlConverter.SKIP_HEADING_1.get(options);
        skipHeading2 = FlexmarkHtmlConverter.SKIP_HEADING_2.get(options);
        skipHeading3 = FlexmarkHtmlConverter.SKIP_HEADING_3.get(options);
        skipHeading4 = FlexmarkHtmlConverter.SKIP_HEADING_4.get(options);
        skipHeading5 = FlexmarkHtmlConverter.SKIP_HEADING_5.get(options);
        skipHeading6 = FlexmarkHtmlConverter.SKIP_HEADING_6.get(options);
        skipAttributes = FlexmarkHtmlConverter.SKIP_ATTRIBUTES.get(options);
        skipFencedCode = FlexmarkHtmlConverter.SKIP_FENCED_CODE.get(options);
        skipCharEscape = FlexmarkHtmlConverter.SKIP_CHAR_ESCAPE.get(options);
        divTableProcessing = FlexmarkHtmlConverter.DIV_TABLE_PROCESSING.get(options);
        extInlineStrong = FlexmarkHtmlConverter.EXT_INLINE_STRONG.get(options);
        extInlineEmphasis = FlexmarkHtmlConverter.EXT_INLINE_EMPHASIS.get(options);
        extInlineCode = FlexmarkHtmlConverter.EXT_INLINE_CODE.get(options);
        extInlineDel = FlexmarkHtmlConverter.EXT_INLINE_DEL.get(options);
        extInlineIns = FlexmarkHtmlConverter.EXT_INLINE_INS.get(options);
        extInlineSub = FlexmarkHtmlConverter.EXT_INLINE_SUB.get(options);
        extInlineSup = FlexmarkHtmlConverter.EXT_INLINE_SUP.get(options);
        extMath = FlexmarkHtmlConverter.EXT_MATH.get(options);
        extInlineLink = FlexmarkHtmlConverter.EXT_INLINE_LINK.get(options);
        extInlineImage = FlexmarkHtmlConverter.EXT_INLINE_IMAGE.get(options);
        orderedListDelimiter = FlexmarkHtmlConverter.ORDERED_LIST_DELIMITER.get(options);
        unorderedListDelimiter = FlexmarkHtmlConverter.UNORDERED_LIST_DELIMITER.get(options);
        definitionMarkerSpaces = FlexmarkHtmlConverter.DEFINITION_MARKER_SPACES.get(options);
        minSetextHeadingMarkerLength = Utils.minLimit(FlexmarkHtmlConverter.MIN_SETEXT_HEADING_MARKER_LENGTH.get(options), 3);
        listItemIndent = FlexmarkHtmlConverter.LIST_ITEM_INDENT.get(options);
        codeIndent = FlexmarkHtmlConverter.CODE_INDENT.get(options);
        eolInTitleAttribute = FlexmarkHtmlConverter.EOL_IN_TITLE_ATTRIBUTE.get(options);
        nbspText = FlexmarkHtmlConverter.NBSP_TEXT.get(options);
        thematicBreak = FlexmarkHtmlConverter.THEMATIC_BREAK.get(options);
        outputAttributesNamesRegex = FlexmarkHtmlConverter.OUTPUT_ATTRIBUTES_NAMES_REGEX.get(options);
        outputAttributesNamesRegexPattern = Pattern.compile(outputAttributesNamesRegex);
        uniqueLinkRefIdGenerator = FlexmarkHtmlConverter.UNIQUE_LINK_REF_ID_GENERATOR.get(options);
        outputIdAttributeRegex = FlexmarkHtmlConverter.OUTPUT_ID_ATTRIBUTE_REGEX.get(options);
        outputIdAttributeRegexPattern = Pattern.compile(outputIdAttributeRegex);
        tableCellAlignmentMap = FlexmarkHtmlConverter.TABLE_CELL_ALIGNMENT_MAP.get(options);
        tableOptions = new TableFormatOptions(options);
        formatFlags = FlexmarkHtmlConverter.FORMAT_FLAGS.get(options);
        maxBlankLines = FlexmarkHtmlConverter.MAX_BLANK_LINES.get(options);
        maxTrailingBlankLines = FlexmarkHtmlConverter.MAX_TRAILING_BLANK_LINES.get(options);
        unwrappedTags = FlexmarkHtmlConverter.UNWRAPPED_TAGS.get(options);
        wrappedTags = FlexmarkHtmlConverter.WRAPPED_TAGS.get(options);
        divTableRowClasses = FlexmarkHtmlConverter.DIV_TABLE_ROW_CLASSES.get(options);
        divTableCellClasses = FlexmarkHtmlConverter.DIV_TABLE_CELL_CLASSES.get(options);
        divTableHdrClasses = FlexmarkHtmlConverter.DIV_TABLE_HDR_CLASSES.get(options);
    }

    @NotNull
    @Override
    public MutableDataHolder setIn(@NotNull MutableDataHolder dataHolder) {
        dataHolder.set(FlexmarkHtmlConverter.LIST_CONTENT_INDENT, listContentIndent);
        dataHolder.set(FlexmarkHtmlConverter.SETEXT_HEADINGS, setextHeadings);
        dataHolder.set(FlexmarkHtmlConverter.OUTPUT_UNKNOWN_TAGS, outputUnknownTags);
        dataHolder.set(FlexmarkHtmlConverter.TYPOGRAPHIC_QUOTES, typographicQuotes);
        dataHolder.set(FlexmarkHtmlConverter.TYPOGRAPHIC_SMARTS, typographicSmarts);
        dataHolder.set(FlexmarkHtmlConverter.OUTPUT_ATTRIBUTES_ID, outputAttributesIdAttr);
        dataHolder.set(FlexmarkHtmlConverter.WRAP_AUTO_LINKS, wrapAutoLinks);
        dataHolder.set(FlexmarkHtmlConverter.EXTRACT_AUTO_LINKS, extractAutoLinks);
        dataHolder.set(FlexmarkHtmlConverter.RENDER_COMMENTS, renderComments);
        dataHolder.set(FlexmarkHtmlConverter.DOT_ONLY_NUMERIC_LISTS, dotOnlyNumericLists);
        dataHolder.set(FlexmarkHtmlConverter.COMMENT_ORIGINAL_NON_NUMERIC_LIST_ITEM, commentOriginalNonNumericListItem);
        dataHolder.set(FlexmarkHtmlConverter.PRE_CODE_PRESERVE_EMPHASIS, preCodePreserveEmphasis);
        dataHolder.set(FlexmarkHtmlConverter.LISTS_END_ON_DOUBLE_BLANK, listsEndOnDoubleBlank);
        dataHolder.set(FlexmarkHtmlConverter.DIV_AS_PARAGRAPH, divAsParagraph);
        dataHolder.set(FlexmarkHtmlConverter.BR_AS_PARA_BREAKS, brAsParaBreaks);
        dataHolder.set(FlexmarkHtmlConverter.BR_AS_EXTRA_BLANK_LINES, brAsExtraBlankLines);
        dataHolder.set(FlexmarkHtmlConverter.IGNORE_TABLE_HEADING_AFTER_ROWS, ignoreTableHeadingAfterRows);
        dataHolder.set(FlexmarkHtmlConverter.ADD_TRAILING_EOL, addTrailingEol);
        dataHolder.set(FlexmarkHtmlConverter.SKIP_HEADING_1, skipHeading1);
        dataHolder.set(FlexmarkHtmlConverter.SKIP_HEADING_2, skipHeading2);
        dataHolder.set(FlexmarkHtmlConverter.SKIP_HEADING_3, skipHeading3);
        dataHolder.set(FlexmarkHtmlConverter.SKIP_HEADING_4, skipHeading4);
        dataHolder.set(FlexmarkHtmlConverter.SKIP_HEADING_5, skipHeading5);
        dataHolder.set(FlexmarkHtmlConverter.SKIP_HEADING_6, skipHeading6);
        dataHolder.set(FlexmarkHtmlConverter.SKIP_ATTRIBUTES, skipAttributes);
        dataHolder.set(FlexmarkHtmlConverter.SKIP_FENCED_CODE, skipFencedCode);
        dataHolder.set(FlexmarkHtmlConverter.SKIP_CHAR_ESCAPE, skipCharEscape);
        dataHolder.set(FlexmarkHtmlConverter.DIV_TABLE_PROCESSING, divTableProcessing);
        dataHolder.set(FlexmarkHtmlConverter.EXT_INLINE_STRONG, extInlineStrong);
        dataHolder.set(FlexmarkHtmlConverter.EXT_INLINE_EMPHASIS, extInlineEmphasis);
        dataHolder.set(FlexmarkHtmlConverter.EXT_INLINE_CODE, extInlineCode);
        dataHolder.set(FlexmarkHtmlConverter.EXT_INLINE_DEL, extInlineDel);
        dataHolder.set(FlexmarkHtmlConverter.EXT_INLINE_INS, extInlineIns);
        dataHolder.set(FlexmarkHtmlConverter.EXT_INLINE_SUB, extInlineSub);
        dataHolder.set(FlexmarkHtmlConverter.EXT_INLINE_SUP, extInlineSup);
        dataHolder.set(FlexmarkHtmlConverter.ORDERED_LIST_DELIMITER, orderedListDelimiter);
        dataHolder.set(FlexmarkHtmlConverter.UNORDERED_LIST_DELIMITER, unorderedListDelimiter);
        dataHolder.set(FlexmarkHtmlConverter.DEFINITION_MARKER_SPACES, definitionMarkerSpaces);
        dataHolder.set(FlexmarkHtmlConverter.MIN_SETEXT_HEADING_MARKER_LENGTH, minSetextHeadingMarkerLength);
        dataHolder.set(FlexmarkHtmlConverter.CODE_INDENT, codeIndent);
        dataHolder.set(FlexmarkHtmlConverter.EOL_IN_TITLE_ATTRIBUTE, eolInTitleAttribute);
        dataHolder.set(FlexmarkHtmlConverter.NBSP_TEXT, nbspText);
        dataHolder.set(FlexmarkHtmlConverter.THEMATIC_BREAK, thematicBreak);
        dataHolder.set(FlexmarkHtmlConverter.OUTPUT_ATTRIBUTES_NAMES_REGEX, outputAttributesNamesRegex);
        dataHolder.set(FlexmarkHtmlConverter.UNIQUE_LINK_REF_ID_GENERATOR, uniqueLinkRefIdGenerator);
        dataHolder.set(FlexmarkHtmlConverter.TABLE_CELL_ALIGNMENT_MAP, tableCellAlignmentMap);
        dataHolder.set(FlexmarkHtmlConverter.OUTPUT_ID_ATTRIBUTE_REGEX, outputIdAttributeRegex);
        dataHolder.set(FlexmarkHtmlConverter.EXT_MATH, extMath);
        dataHolder.set(FlexmarkHtmlConverter.EXT_INLINE_LINK, extInlineLink);
        dataHolder.set(FlexmarkHtmlConverter.EXT_INLINE_IMAGE, extInlineImage);
        dataHolder.setFrom(tableOptions);
        dataHolder.set(FlexmarkHtmlConverter.FORMAT_FLAGS, formatFlags);
        dataHolder.set(FlexmarkHtmlConverter.MAX_BLANK_LINES, maxBlankLines);
        dataHolder.set(FlexmarkHtmlConverter.MAX_TRAILING_BLANK_LINES, maxTrailingBlankLines);
        dataHolder.set(FlexmarkHtmlConverter.UNWRAPPED_TAGS, unwrappedTags);
        dataHolder.set(FlexmarkHtmlConverter.WRAPPED_TAGS, wrappedTags);
        dataHolder.set(FlexmarkHtmlConverter.DIV_TABLE_ROW_CLASSES, divTableRowClasses);
        dataHolder.set(FlexmarkHtmlConverter.DIV_TABLE_CELL_CLASSES, divTableCellClasses);
        dataHolder.set(FlexmarkHtmlConverter.DIV_TABLE_HDR_CLASSES, divTableHdrClasses);
        return dataHolder;
    }
}
