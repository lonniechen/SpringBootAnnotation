package jsonInclude;

/**
 * @author Lang
 *
 *	@JsonInclude will tell Java what kind of fields will be serialized, like @JsonInclude(JsonInclude.Include.NON_EMPTY) indicates only non empty field will be serialized
 *	@JsonProperty("XXX") define the field name of a JSON, no matter what it was before serialization
 *	@JsonIgnore tells Java to ignore the fields not to be serialized
 *	@JsonPropertyOrder({"A","B","C"}) define the order of fields appear in JSON
 */
public class Info {

}
