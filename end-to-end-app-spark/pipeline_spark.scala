// customer rating events
import java.sql.Timestamp
import java.time.Instant

case class CustomerRatingEventType(
    override val created: Timestamp,
    override val eventType: String = "CustomerRatingEventType",
    override val label: String,
    override val customerId: String,
    override val rating: Int,
    override val ratingType: Stirng,
    override val storId: Option[String] = None
    override val itemId: Option[String] = None
) extends CustomerEvent with RatingEvent