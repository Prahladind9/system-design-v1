export class PrimaryTransaction {
    constructor(
        public id: number,
        public date: Date,
        public description: string,
        public type: string,
        public status: string,
        public amount: number,
        public availableBalance: number
    ){}
}
